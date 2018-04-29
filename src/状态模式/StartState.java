package 状态模式;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }

}
