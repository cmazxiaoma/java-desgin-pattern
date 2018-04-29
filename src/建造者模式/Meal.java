package 建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    
    private List<IItem> items = new ArrayList<IItem>();
    
    public void addItem(IItem item) {
        items.add(item);
    }
    
    public float getTotalPrice() {
        float price = 0.0f;
        
        for (IItem item : items) {
            price += item.price();
        }
        return price;
    }
    
    public void showItems() {
        for (IItem item : items) {
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        }
    }
}
