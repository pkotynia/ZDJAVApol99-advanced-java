package concurency;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

    private final CountDownLatch countDownLatch;

    public Task(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Performing some heavy operations");
        countDownLatch.countDown();
    }
}
