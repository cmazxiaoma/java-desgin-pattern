package 外观模式;

public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
