package 原型模式;

public class PrototypePatternDemo {
    
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape rectangle = (Rectangle) ShapeCache.getShape("1");
        if (rectangle != null) {
            rectangle.draw();
            System.out.println(rectangle.getType());
        }
        
        
        Shape square = (Square) ShapeCache.getShape("2");
        if (square != null) {
            square.draw();
            System.out.println(square.getType());
        }
    }
}
