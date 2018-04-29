package 组成实体模式;

public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("garrett", "mayday");
        client.printData();
    }
}
