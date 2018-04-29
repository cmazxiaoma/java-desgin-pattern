package 模板模式;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();
    }
}
