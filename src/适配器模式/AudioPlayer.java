package 适配器模式;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("play " + fileName + ".mp3");
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("illegal audio type");
        }
    }
}
