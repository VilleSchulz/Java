//Task 3: Categorizing Items
//Enhance the GroceryListManager class to support categorizing items. Each item should belong to a
// category (e.g., "Fruits", "Dairy", "Bakery"). Add the following methods:
//addItem(String item, double cost, String category): This method should add the given item to the
// grocery list along with its category.
//displayByCategory(String category): This method should display all items in the specified category.

import java.util.ArrayList;

public class GroceryListManager_t03 {

    private final ArrayList<GroceryItem> groceryList3 = new ArrayList<>();

    public void addItem(String item, double price, String category) {
        GroceryItem item_ = new GroceryItem(item, price, category);
        groceryList3.add(item_);
        System.out.println(item+" added");

    }

    public void removeItem(String item) {
        System.out.println("Removing " + item);
        groceryList3.remove(item);
    }

    public void displayList() {
        if (groceryList3.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (GroceryItem groceryItem : groceryList3) {
                double price_ = groceryItem.price;
                String category_ = groceryItem.category;
                String itemName = groceryItem.itemName;

                System.out.println(category_+ ": " +itemName + " price: " + price_);
            }
        }


    }


    public boolean checkItem(String item) {
        for (int i = 0; i <groceryList3.size(); i++){
            //String itemName =


        }
        System.out.print("Is " + item + " in grocery list? ");
        return true;//groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;
        if (groceryList3.isEmpty()) {
            System.out.println("List is empty");
        } else {
            displayList();
            System.out.println("Calculating  groceries total cost");

           /* for (double cost : groceryList.values()) {
                total += cost;


            }*/
        }
        return total;
    }




    public static void main_() {
        GroceryListManager_t03 groceryListManager = new GroceryListManager_t03();
        groceryListManager.addItem("Apple", 0.99, "Fruit");
        groceryListManager.addItem("Milk", 0.88, "Drink");
        groceryListManager.addItem("Beer", 5, "Alcohol");
       // System.out.println(groceryListManager.checkItem("Milk"));

        System.out.println(groceryListManager.calculateTotalCost());

        //groceryListManager.removeItem("Apple");
       // System.out.println(groceryListManager.checkItem("Apple"));
        //System.out.println(groceryListManager.calculateTotalCost());


    }

    public static void main(String[] args) {
        GroceryListManager_t03.main_();

    }


}

