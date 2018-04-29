package 空对象模式;

public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("garrett");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("mayday");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("xiaoma");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("xxxxx");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
