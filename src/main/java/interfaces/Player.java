package interfaces;

public interface Player {

    String name = "Player";

    void play();
    void stop();

    default void skipItem() {
        System.out.println("skipping item");
    }
}
