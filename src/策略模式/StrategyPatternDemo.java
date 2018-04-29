package 策略模式;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(4, 3));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(3, 4));
    }
}
