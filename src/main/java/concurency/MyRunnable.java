package concurency;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        //this code will be executed in separate thread
        System.out.println(Thread.currentThread());
        System.out.println("Hello from runnable");
    }
}
