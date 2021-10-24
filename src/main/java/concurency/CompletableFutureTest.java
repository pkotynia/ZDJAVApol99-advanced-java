package concurency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
Where to go from here:

sync   T getData()              List<T> getData()
async  Future<T> getData()      Observable<T> getData() - reactive programing
**/

public class CompletableFutureTest {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("task supplied asynchronously " + Thread.currentThread().getName());
//            return 44;
//        }, executorService);
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture
                .supplyAsync(() -> calculateMeaningOfLife())
                .thenApply(result -> andThenAdd60(result))
                .thenAccept(result -> processResult(result));

        //System.out.println("I am not blocked");

        try {
            voidCompletableFuture.get();
            System.out.println(" this is in " + Thread.currentThread().getName());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

//        executorService.shutdown();
    }

    private static void processResult(Integer result) {
        result = result + 300;
        System.out.println(result);
    }

    private static int andThenAdd60(Integer result) {
        System.out.println("then Apply " + Thread.currentThread().getName());
        return result + 60;
    }

    private static int calculateMeaningOfLife() {
        System.out.println("task supplied asynchronously " + Thread.currentThread().getName());
        return 44;
    }
}
