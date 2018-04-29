package 工厂模式;

public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape rect = factory.getShape("rectangle");
        
        if (rect != null) {
            rect.draw();
        }
        IShape square = factory.getShape("square");
        
        if (square != null) {
            square.draw();
        }
    }
}
