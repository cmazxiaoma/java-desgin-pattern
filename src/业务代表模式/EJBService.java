package 业务代表模式;

public class EJBService implements IBusinessService {

    @Override
    public void doProcessing() {
        System.out.println("invoking EJB Service");
    }
}
