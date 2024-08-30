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
        System.out.println(item + " added");

    }

    public void removeItem(String item) {
        for (int i = 0; i< groceryList3.size();i++) {
            if (groceryList3.get(i).getItemName().equals(item)) {
                groceryList3.remove(i);
                System.out.println("Removing " + item);
            }
        }
    }

    public double displayList() {
        double totalPrice = 0;
        if (groceryList3.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (GroceryItem groceryItem : groceryList3) {
                double price_ = groceryItem.getPrice();
                String category_ = groceryItem.getCategory();
                String itemName = groceryItem.getItemName();
                totalPrice += price_;
                System.out.println(category_ + ": " + itemName + " price: " + price_);
            }
        }

        return totalPrice;
    }


    public boolean checkItem(String item) {
        boolean found = false;
        System.out.print("Is " + item + " in grocery list? ");

        for (GroceryItem groceryItem : groceryList3) {
            if (groceryItem.getItemName().equals(item)) {
                found = true;
            }
        }
        return found;

    }

    public void calculateTotalCost() {
        System.out.println("Calculating  groceries total cost");
        System.out.println("Total cost: " + displayList()+"\n");//diplaylist returns total price.
        //total cost prints it

    }
    public String displayByCategory(String category) {
        StringBuilder rtn = new StringBuilder();
        System.out.println("Items in " + category + ":");
        for (GroceryItem groceryItem : groceryList3) {
            if (groceryItem.getCategory().equals(category)) {
                String item = groceryItem.getItemName() + " " + "price: " + groceryItem.getPrice() + "\n";
                rtn.append(item);
            }
        }
        return rtn.toString();
    }


    public static void main_() {
        GroceryListManager_t03 groceryListManager = new GroceryListManager_t03();
        groceryListManager.addItem("Apple", 0.99, "Fruit");
        groceryListManager.addItem("Milk", 0.88, "Drink");

        groceryListManager.addItem("Beer", 5, "Alcohol");
        groceryListManager.addItem("Orange", 0.99, "Fruit");

        System.out.println(groceryListManager.checkItem("Milk"));

        groceryListManager.calculateTotalCost();
        System.out.println(groceryListManager.displayByCategory("Fruit"));


        groceryListManager.removeItem("Apple");
        System.out.println(groceryListManager.checkItem("Apple"));
        groceryListManager.calculateTotalCost();

    }

    public static void main(String[] args) {
        GroceryListManager_t03.main_();

    }


}

