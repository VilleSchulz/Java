
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    private final String title;
    private final HashMap<String, Integer> shoppingListItems = new HashMap<>();

    public ShoppingList(String title) {
        this.title = title;
        GroceryListManager_t05.addShoppingList(this);
    }


    public String getTitle() {
        return title;
    }

    public void addItem(String item, int quantity) {
        shoppingListItems.put(item,quantity);


    }
    public void removeItem(String item) {
        shoppingListItems.remove(item);
        System.out.println("\nFrom "+getTitle()+": "+item+" removed\n");

    }
    public void displayItems() {
        System.out.println("Items in: "+ getTitle());
        System.out.println("*****************");
        for(Map.Entry<String, Integer> entry : shoppingListItems.entrySet()) {
            System.out.println(entry.getKey()+ ", "+ entry.getValue()+" pcs");
        }
    }

}
