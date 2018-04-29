package 解释器模式;

public class InterpreterPatternDemo {

    public static IExpression getMaleExpression() {
        IExpression garrett = new TerminalExpression("garrett");
        IExpression cody = new TerminalExpression("cody");
        return new OrExpression(garrett, cody);
    }

    public static IExpression getMarriedWomanExpression() {
        IExpression xiaoma = new TerminalExpression("xiaoma");
        IExpression married = new TerminalExpression("married");
        return new AndExpression(xiaoma, married);
    }

    public static void main(String[] args) {
        IExpression isMale = getMaleExpression();
        IExpression isMarriedWoman = getMarriedWomanExpression();

        System.out.println(isMale.interpret("garrett"));
        System.out.println(isMarriedWoman.interpret("xiaoma married"));
    }
}
