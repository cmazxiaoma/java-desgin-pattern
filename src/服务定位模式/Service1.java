package 服务定位模式;

public class Service1 implements IService {

    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("executing service1");
    }
}
