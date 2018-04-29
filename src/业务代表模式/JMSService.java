package 业务代表模式;

public class JMSService implements IBusinessService {

    @Override
    public void doProcessing() {
        System.out.println("invoking JMS Service");
    }
}
