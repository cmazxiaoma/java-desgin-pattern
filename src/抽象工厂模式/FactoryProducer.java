package 抽象工厂模式;

public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice) {
        if (choice == null || choice.equals("")) {
            return null;
        }
        
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        
        return null;
    }
}
