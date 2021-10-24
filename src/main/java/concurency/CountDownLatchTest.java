package concurency;

import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

public class CountDownLatchTest {

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(6);

        Stream.generate(() -> new Task(countDownLatch))
                .limit(5)
                .map(task -> new Thread(task))
                .forEach(thread -> thread.start());

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Keep up the good work");

    }
}
