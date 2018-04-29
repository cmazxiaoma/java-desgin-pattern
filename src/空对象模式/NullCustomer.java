package 空对象模式;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNULL() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer Database";
    }
}
