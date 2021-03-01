package com.github.alexeylapin.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.function.Consumer;

public class CallbackFinalizingPhantomReference extends PhantomReference<Object> {

    private final String description;
    private final Consumer<String> callback;

    public CallbackFinalizingPhantomReference(Object referent, ReferenceQueue<? super Object> q, Consumer<String> callback) {
        super(referent, q);
        this.description = referent.toString();
        this.callback = callback;
    }

    public void finalizeResources() {
        callback.accept(description);
    }

    @Override
    public String toString() {
        return "ContainerPhantomReference[" + description + "]";
    }
}
