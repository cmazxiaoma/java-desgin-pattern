package 装饰器模式;

public class DecoratorPatternDemo {
    
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        
        IShape square = new Square();
        IShape redSquare = new RedShapeDecorator(square);
        redSquare.draw();
    }
}
