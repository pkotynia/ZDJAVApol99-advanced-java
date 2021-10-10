package concurency;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from other thread");
        System.out.println(Thread.currentThread());
    }
}
