package 适配器模式;

public class MediaAdapter implements MediaPlayer {
    
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter (String audioType) {
        
        if (audioType.equals("") || audioType == null) {
            throw new IllegalArgumentException("data illegal");
        }
        
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
