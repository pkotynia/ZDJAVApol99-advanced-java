package concurency;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Hello from callable");
        return "Work is done";
    }
}
