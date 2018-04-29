package 抽象工厂模式;

public class ColorFactory extends AbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        return null;
    }

    @Override
    public IColor getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("green")) {
            return new Green();
        }
        
        return null;
    }
}
