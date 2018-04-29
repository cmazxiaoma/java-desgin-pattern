package 原型模式;

import java.util.Hashtable;

public class ShapeCache {
    
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    
    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        Shape cloneShape = null;
        try {
            cloneShape = (Shape) cacheShape.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cloneShape;
    }
    
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);
        
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
