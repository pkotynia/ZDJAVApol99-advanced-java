package concurency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThreadSafeCounter {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public AtomicInteger getCount() {
        return count;
    }
}
