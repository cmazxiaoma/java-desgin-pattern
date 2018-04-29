package 适配器模式;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("play " + fileName + ".vlc");
    }

    @Override
    public void playMp4(String fileName) {
        // TODO Auto-generated method stub
        
    }
}
