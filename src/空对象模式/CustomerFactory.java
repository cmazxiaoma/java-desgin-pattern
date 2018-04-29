package 空对象模式;

public class CustomerFactory {

    public static final String[] names = new String[] { "garrett", "mayday", "xiaoma" };

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
