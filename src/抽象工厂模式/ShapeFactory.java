package 抽象工厂模式;

public class ShapeFactory extends AbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        
        return null;
    }

    @Override
    public IColor getColor(String colorType) {
        return null;
    }
}
