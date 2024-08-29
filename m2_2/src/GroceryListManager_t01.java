//addItem(String item): This method should add the given item to the grocery list.
//removeItem(String item): This method should remove the given item from the grocery list.
//displayList(): This method should display all the items in the grocery list.
//checkItem(String item): This method should check if the given item is present in the grocery list and return a boolean value.
//Create a main method in the GroceryListManager class to demonstrate the functionality of the methods you implemented. In the main method, perform the following actions:
//


import java.util.ArrayList;

public class GroceryListManager_t01 {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i+1 + ": " + groceryList.get(i));
            }
        }

    }
}
