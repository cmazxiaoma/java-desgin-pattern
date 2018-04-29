package 桥接模式;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;
    
    public Circle(IDrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
