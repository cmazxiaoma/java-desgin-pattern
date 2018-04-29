package 建造者模式;

public class Bottle implements IPacking {

    @Override
    public String pack() {
        return "bottom";
    }
}
