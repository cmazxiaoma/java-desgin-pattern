package 访问者模式;

public interface IComputerPart {

    public void accept(ComputerPartVisitor visitor);
}
