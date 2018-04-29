package 访问者模式;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        IComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
