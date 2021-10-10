package concurency;

import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

public class CountDownLatchTest {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(5);

        Stream.generate(() -> new Worker(countDownLatch))
                .limit(5)
                .map(worker -> new Thread(worker))
                .forEach(thread -> thread.start());

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Keep up the good work");

    }
}
