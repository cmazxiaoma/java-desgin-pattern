package 访问者模式;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("displaying computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("displaying keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying monitor");
    }
}
