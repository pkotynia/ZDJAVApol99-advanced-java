package concurency;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeCounter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
