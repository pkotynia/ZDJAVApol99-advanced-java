package concurency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

    public static void main(String[] args) {
        CallableTask callableTask = new CallableTask();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> futureTask = executorService.submit(callableTask);

        System.out.println("Doing some important work");

        try {
            System.out.println("Result of future task " + futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
