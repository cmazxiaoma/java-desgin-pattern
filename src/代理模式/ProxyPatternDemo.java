package 代理模式;

public class ProxyPatternDemo {
    
    public static void main(String[] args) {
        Image image = new ProxyImage(new RealImage("garrett.png"), "doudou.png");
        image.display();
    }
}
