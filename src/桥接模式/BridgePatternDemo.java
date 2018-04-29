package 桥接模式;

public class BridgePatternDemo {
    
    public static void main(String[] args) {
        Shape redShape = new Circle(new RedCircle(), 1, 1, 2);
        Shape greenShape = new Circle(new GreenCircle(), 1, 1, 2);
        if (redShape != null) {
            redShape.draw();
        }
        
        if (greenShape != null) {
            greenShape.draw();
        }
    }
}
