package 建造者模式;

public abstract class Burger implements IItem {
    
    @Override
    public IPacking packing() {
        return new Wrapper();
    }
}
