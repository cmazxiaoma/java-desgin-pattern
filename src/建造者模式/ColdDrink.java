package 建造者模式;

public abstract class ColdDrink implements IItem {

    @Override
    public IPacking packing() {
        return new Bottle();
    }
}
