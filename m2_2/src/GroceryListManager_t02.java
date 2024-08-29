import java.util.ArrayList;




import java.util.ArrayList;

public class GroceryListManager_t02 {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String item) {
        groceryList.add(item);
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
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println(i + 1 + ": " + groceryList.get(i));
            }
        }

    }

    public boolean checkItem(String item) {
        System.out.print("Is " + item + " in grocery list? ");
        return groceryList.contains(item);
    }
}


