package interfaces;

public class MediaPlayerClient {

    public static void main(String[] args) {
        Player musicPlayer = new MusicPlayer();

        musicPlayer.play();
        musicPlayer.stop();
        System.out.println(MusicPlayer.name);
        musicPlayer.skipItem();

        Player videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.stop();
        videoPlayer.skipItem();

        Player polsatPlayer = new Player() {
            @Override
            public void play() {
                System.out.println("play");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        };

        polsatPlayer.play();
        polsatPlayer.stop();
    }
}
