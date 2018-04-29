package 备忘录模式;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker taker = new CareTaker();

        originator.setState("state #1");
        originator.setState("state #2");

        taker.add(originator.saveStateToMemento());

        originator.setState("state #3");
        taker.add(originator.saveStateToMemento());

        originator.setState("state #4");
        System.out.println("current state=" + originator.getState());

        originator.getStateFromMemento(taker.get(0));
        System.out.println("first saved state=" + originator.getState());

        originator.getStateFromMemento(taker.get(1));
        System.out.println("second saved state=" + originator.getState());
    }
}
