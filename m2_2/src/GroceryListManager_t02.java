////Task 2: Total Cost Calculation
////Modify the GroceryListManager class to store both the item name and its corresponding cost as a pair
//// (e.g., using a HashMap<String, Double>). Add the following methods:
////addItem(String item, double cost): This method should add the given item and its cost to the grocery list.
////calculateTotalCost(): This method should calculate and return the total cost of all items in the grocery list.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager_t02 {

    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
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


    public static void main_() {
        GroceryListManager_t02 groceryListManager = new GroceryListManager_t02();
        groceryListManager.addItem("Apple", 0.99);
        groceryListManager.addItem("Milk", 0.88);
        groceryListManager.addItem("Beer", 5);
        System.out.println(groceryListManager.checkItem("Milk"));

        System.out.println(groceryListManager.calculateTotalCost());

        groceryListManager.removeItem("Apple");
        System.out.println(groceryListManager.checkItem("Apple"));
        System.out.println(groceryListManager.calculateTotalCost());



    }

    public static void main(String[] args) {
        GroceryListManager_t02.main_();

    }


}

