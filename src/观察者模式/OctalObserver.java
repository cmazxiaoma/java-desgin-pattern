package 观察者模式;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("octal:" + Integer.toOctalString(subject.getState()));
    }
}
