package 服务定位模式;

public class Service2 implements IService {

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("executing service2");
    }
}
