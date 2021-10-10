package concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CounterTest {

    public static void main(String[] args) {
        //we are using ExecutorService to create pool of 5 reusable threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        AtomicThreadSafeCounter counter = new AtomicThreadSafeCounter();
        //ThreadSafeCounter counter = new ThreadSafeCounter();
        //Counter counter = new Counter();

        //we are submiting 2000 increment counter tasks to be run by executorService on 5 threads pool
        for (int i = 0; i < 2000; i++) {
            executorService.submit(() -> counter.increment());
        }

        //giving time for main thread to proceed
        try {
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

        //if we would not shutdown executor program would run in endless loop waiting for new tasks to be submitted
        executorService.shutdown();
    }
}
