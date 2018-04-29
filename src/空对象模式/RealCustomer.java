package 空对象模式;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNULL() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
