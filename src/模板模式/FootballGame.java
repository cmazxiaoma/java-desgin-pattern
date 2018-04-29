package 模板模式;

public class FootballGame extends Game {

    @Override
    public void initialize() {
        System.out.println("football game initialize");
    }

    @Override
    public void startPlay() {
        System.out.println("football game starting");
    }

    @Override
    public void endPlay() {
        System.out.println("football game finished");
    }
}
