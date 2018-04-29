package 外观模式;

public class ShapeMaker {
    
    private IShape circle;
    private IShape square;
    
    public ShapeMaker() {
        super();
        this.circle = new Circle();
        this.square = new Square();
    }
    
    public void drawSquare() {
        this.square.draw();
    }
    
    public void drawCircle() {
        this.circle.draw();
    }
}
