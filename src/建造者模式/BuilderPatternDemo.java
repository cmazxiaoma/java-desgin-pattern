package 建造者模式;

public class BuilderPatternDemo {
    
    public static void main(String[] args) {
        MealBuidler mealBuidler = new MealBuidler();
        Meal vegMeal = mealBuidler.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("total price" + vegMeal.getTotalPrice());
        
        Meal chickMeal = mealBuidler.prepareChickMeal();
        System.out.println("chicken meal");
        chickMeal.showItems();
        System.out.println("total price" + chickMeal.getTotalPrice());
    }
}
