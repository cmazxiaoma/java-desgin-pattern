package 适配器模式;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play " + fileName + ".mp4");
    }
}
