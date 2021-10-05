package interfaces;

public class PolsatPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Polsat is playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Kevin home alone");
    }
}
