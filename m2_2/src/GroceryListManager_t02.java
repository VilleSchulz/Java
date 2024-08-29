////Task 2: Total Cost Calculation
////Modify the GroceryListManager class to store both the item name and its corresponding cost as a pair
//// (e.g., using a HashMap<String, Double>). Add the following methods:
////addItem(String item, double cost): This method should add the given item and its cost to the grocery list.
////calculateTotalCost(): This method should calculate and return the total cost of all items in the grocery list.

import java.util.ArrayList;

public class GroceryListManager_t02 {

    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        System.out.println("Removing "+ item);
        groceryList.remove(item);
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i + 1 + ": " + groceryList.get(i));
            }
        }

    }
    public boolean checkItem(String item) {
        System.out.print("Is "+item+" in grocery list? ");
        return groceryList.contains(item);
    }
    public static void main_() {
        GroceryListManager_t02 groceryListManager = new GroceryListManager_t02();
        groceryListManager.addItem("Apple");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Beer");
        System.out.println(groceryListManager.checkItem("Milk"));

        groceryListManager.removeItem("Apple");
        groceryListManager.displayList();

        groceryListManager.removeItem("Milk");

        groceryListManager.displayList();

        groceryListManager.removeItem("Beer");
        groceryListManager.displayList();

    }
    public static void main(String[] args){
        GroceryListManager_t02.main_();

    }



}

