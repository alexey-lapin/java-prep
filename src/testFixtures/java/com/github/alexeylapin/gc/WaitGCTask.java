package com.github.alexeylapin.gc;

import java.lang.ref.Reference;
import java.util.List;

class WaitGCTask implements Runnable {

    private final List<CallbackFinalizingPhantomReference> references;

    public WaitGCTask(List<CallbackFinalizingPhantomReference> references) {
        this.references = references;
    }

    @Override
    public void run() {
        while (!references.isEmpty()) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("interrupted");
                return;
            }
            references.removeIf(Reference::isEnqueued);
        }
    }
}
