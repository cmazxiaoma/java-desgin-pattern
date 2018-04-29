package 中介者模式;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User garrett = new User("garrett");
        User xiaoma = new User("xiaoma");

        garrett.sendMessage("Hi,xiaoma");
        xiaoma.sendMessage("Hi,garrett");
    }
}
