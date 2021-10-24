package concurency;

public class ThreadPlayground {

    // this one is to show dependency injection
    // we can pass in constructor any type that will implement Runnable interface and set ThreadPlayground behavior
    private Runnable runnable;

    public ThreadPlayground(Runnable runnable) {
        this.runnable = runnable;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public static void main(String[] args) {
        //static method from Thread was used to get information about thread from which we are running the code
        System.out.println(Thread.currentThread());

        // First way of creating and running code in new thread by extending Thread class
        Thread threadCreatedFromClassExtendingThread = new MyThread();
        // Start method will allow our code to be run in different thread
        threadCreatedFromClassExtendingThread.start();

        // Second way of creating and running code in new thread by implementing Runnable interface
        ThreadPlayground threadPlayground = new ThreadPlayground(new MyRunnable());

        Thread threadCreatedUsingClassImplementingRunnableInterface = new Thread(threadPlayground.getRunnable());
        threadCreatedUsingClassImplementingRunnableInterface.start();

        // Still second way byt this time we are implementing Runnable interface using lambda expression
        Thread threadCreatedUsingLambda = new Thread(() -> {
            System.out.println("Hello from lambda thread");
            System.out.println(Thread.currentThread());
        });
        threadCreatedUsingLambda.start();

        System.out.println("We are ending here");
    }
}
