package 抽象工厂模式;

public class AbstractFactoryPatternDemo {
    
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        
        if (shapeFactory != null) {
            IShape square = shapeFactory.getShape("square");
            
            if (square != null) {
                square.draw();
            }
            
            IShape rectangle = shapeFactory.getShape("rectangle");
            
            if (rectangle != null) {
                rectangle.draw();
            }
        }
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        
        if (colorFactory != null) {
            IColor green = colorFactory.getColor("green");
            
            if (green != null) {
                green.fill();
            } 
            
            IColor red = colorFactory.getColor("red");
            
            if (red != null) {
                red.fill();
            }
        }
    }
}
