package 桥接模式;

public abstract class Shape {
    
    protected IDrawAPI drawAPI;
    
    protected Shape(IDrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    
    public abstract void draw();
}
