package 原型模式;

public class Rectangle extends Shape {
    
    public Rectangle() {
        this.type = "Rectangle";
    }
    
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
