package 桥接模式;

public class RedCircle implements IDrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw red circle, radius :" + radius + "x: " + x + "y :" + y);
    }
}
