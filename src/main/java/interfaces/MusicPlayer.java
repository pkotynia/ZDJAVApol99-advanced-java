package interfaces;

public class MusicPlayer implements Player {

    @Override
    public void play() {
        System.out.println("music is playing");
    }

    @Override
    public void stop() {
        System.out.println("music is stop");
    }

    @Override
    public void skipItem(){
        System.out.println("skipping song");
    }
}
