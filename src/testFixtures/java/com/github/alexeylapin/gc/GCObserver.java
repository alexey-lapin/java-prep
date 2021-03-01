package com.github.alexeylapin.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class GCObserver {

    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();
    private final List<CallbackFinalizingPhantomReference> references = new ArrayList<>();

    public <T> T wrap(T object) {
        return wrap(object, s -> {
        });
    }

    public <T> T wrap(T object, Consumer<String> callback) {
        references.add(new CallbackFinalizingPhantomReference(object, queue, callback));
        return object;
    }

    public void waitForGCAndFinalize(long timeout, TimeUnit timeUnit) {
        System.gc();
        try {
            CompletableFuture.runAsync(new WaitGCTask(references)).get(timeout, timeUnit);
        } catch (Exception e) {
            // noop
        }
        finalizeResources();
    }

    private void finalizeResources() {
        CallbackFinalizingPhantomReference r;
        while ((r = (CallbackFinalizingPhantomReference) queue.poll()) != null) {
            r.finalizeResources();
            r.clear();
        }
    }

}

