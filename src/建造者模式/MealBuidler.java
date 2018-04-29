package 建造者模式;

public class MealBuidler {
    
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    
    public Meal prepareChickMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
