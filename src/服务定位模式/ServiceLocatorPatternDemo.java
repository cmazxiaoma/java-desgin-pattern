package 服务定位模式;

public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        IService service = ServiceLocator.getService("service1");
        service.execute();

        service = ServiceLocator.getService("service2");
        service.execute();

        service = ServiceLocator.getService("service1");
        service.execute();
    }
}
