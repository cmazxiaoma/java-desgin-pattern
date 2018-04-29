package 业务代表模式;

public class Client {

    private BusinessDelegate delegate;

    public Client(BusinessDelegate delegate) {
        super();
        this.delegate = delegate;
    }

    public void doTask() {
        delegate.doTask();
    }
}
