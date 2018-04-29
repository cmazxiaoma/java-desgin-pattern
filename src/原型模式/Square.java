package 原型模式;

public class Square extends Shape {
    
    public Square() {
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
