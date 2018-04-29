package 享元模式;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ShapeFactory {
    
    private static final Map<String, IShape> circleHashMap = new HashMap<String, IShape>();
    
    public static IShape getCircle(String color) {
        Circle circle = (Circle) circleHashMap.get(color);
        
        if (circle == null) {
            circle = new Circle(color);
            circleHashMap.put(color, circle);
            System.out.println("creating " + color + "circle");
        }
        
        return circle;
    }
}
