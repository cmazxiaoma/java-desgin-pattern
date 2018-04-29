package 抽象工厂模式;

public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
