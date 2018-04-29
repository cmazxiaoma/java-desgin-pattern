package 抽象工厂模式;

public abstract class AbstractFactory {
    
    public abstract IShape getShape(String shapeType);
    public abstract IColor getColor(String colorType);
}
