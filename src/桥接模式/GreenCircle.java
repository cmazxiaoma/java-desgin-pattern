package 桥接模式;

public class GreenCircle implements IDrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw green circle, radius: " + radius + "x :" + x + " y: " + y );
    }
}
