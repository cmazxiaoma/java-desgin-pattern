package 装饰器模式;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(IShape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.decoratorShape.draw();
        setBorder(this.decoratorShape);
    }
    
    private void setBorder(IShape shape) {
        System.out.println("draw red border");
    }
}
