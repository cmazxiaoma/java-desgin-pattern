package 服务定位模式;

public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("service1")) {
            System.out.println("looking up and creating a new service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("service2")) {
            System.out.println("looking up and creating a new service2 object");
            return new Service2();
        }

        return null;
    }
}
