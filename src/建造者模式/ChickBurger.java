package 建造者模式;

public class ChickBurger extends Burger {

    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
