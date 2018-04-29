package 代理模式;

import java.lang.reflect.Proxy;

public class DynamicPatternDemo {

    public static void main(String[] args) {
        Image image = new RealImage("garrett.png");
        Image proxyImage = (Image) Proxy.newProxyInstance(Image.class.getClassLoader(), new Class<?>[] { Image.class },
                new DynamicImageProxy(image));
        proxyImage.display();
    }
}
