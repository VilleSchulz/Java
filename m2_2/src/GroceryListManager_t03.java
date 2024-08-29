//Task 3: Categorizing Items
//Enhance the GroceryListManager class to support categorizing items. Each item should belong to a
// category (e.g., "Fruits", "Dairy", "Bakery"). Add the following methods:
//addItem(String item, double cost, String category): This method should add the given item to the
// grocery list along with its category.
//displayByCategory(String category): This method should display all items in the specified category.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_t03 {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item, double price, String category) {
        groceryItem item_ = new groceryItem(item, price, category);

    }

    public void removeItem(String item) {
        System.out.println("Removing " + item);
        groceryList.remove(item);
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            int index = 1;
            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                String item = entry.getKey();
                double price = entry.getValue();
                System.out.println(index + 1 + ": " + item + " price: " + price);
                index++;
            }
        }


    }

    public boolean checkItem(String item) {
        System.out.print("Is " + item + " in grocery list? ");
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;
        if (groceryList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            displayList();
            System.out.println("Calculating  groceries total cost");

            for (double cost : groceryList.values()) {
                total += cost;


            }
        }
        return total;
    }

    public static class groceryItem {
        public static double price;
        public static String category;
        public static String itemName;

        public groceryItem(String item, double price, String category) {
            itemName = item;
            groceryItem.price = price;
            groceryItem.category = category;


        }

    }


    public static void main_() {
        GroceryListManager_t03 groceryListManager = new GroceryListManager_t03();
        groceryListManager.addItem("Apple", 0.99, "Fruit");
        groceryListManager.addItem("Milk", 0.88, "Drink");
        groceryListManager.addItem("Beer", 5, "Alcohol");
        System.out.println(groceryListManager.checkItem("Milk"));

        System.out.println(groceryListManager.calculateTotalCost());

        groceryListManager.removeItem("Apple");
        System.out.println(groceryListManager.checkItem("Apple"));
        System.out.println(groceryListManager.calculateTotalCost());


    }

    public static void main(String[] args) {
        GroceryListManager_t03.main_();

    }


}

