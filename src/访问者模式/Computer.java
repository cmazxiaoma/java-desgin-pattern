package 访问者模式;

public class Computer implements IComputerPart {

    private IComputerPart[] parts;

    public Computer() {
        parts = new IComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }

        visitor.visit(this);
    }
}
