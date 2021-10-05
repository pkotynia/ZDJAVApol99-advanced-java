package interfaces;

public class VideoPlayer implements Player {

    @Override
    public void play() {
        System.out.println("video is playing");
    }

    @Override
    public void stop() {
        System.out.println("stopping video");
    }
}
