package 适配器模式;

public class AdapterPatternDemo {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "garrett");
        audioPlayer.play("vlc", "mayday4");
        audioPlayer.play("mp4", "garrettmayday");
    }
}
