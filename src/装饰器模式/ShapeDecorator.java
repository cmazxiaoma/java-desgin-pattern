package 装饰器模式;

public abstract class ShapeDecorator implements IShape {
    protected IShape decoratorShape;
    
    public ShapeDecorator(IShape shape) {
        this.decoratorShape = shape;
    }
    
    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
