//Task 5: Shopping List
//
//Create a separate class named ShoppingList that represents a list of items needed for a specific purpose
// (e.g., "Backyard BBQ", "Weekend Camping"). The ShoppingList class should have methods to add items, remove items,
// and display the list. Use the ShoppingList class within the GroceryListManager class to manage multiple shopping lists.

import java.util.ArrayList;

public class GroceryListManager_t05 {
    private static final ArrayList<ShoppingList> shoppingLists = new ArrayList<>();
    private final ArrayList<GroceryItem_t05> groceryList5 = new ArrayList<>();
   // private final ArrayList<ShoppingList> shoppingListCatalog = new ArrayList<>();
    public void addItem(String item, double price, String category, int quantity) {
        GroceryItem_t05 item_ = new GroceryItem_t05(item, price, category, quantity);
        groceryList5.add(item_);
        System.out.println(item + " added");

    }


    public void updateQuantity(String item, int newQuantity) {
        if (checkItem(item)) {
            System.out.println("true");
            System.out.println(item + " quantity");//check if item in list
            for (GroceryItem_t05 item_ : groceryList5) {
                if (item_.getItemName().equals(item)) {
                    item_.setQuantity(newQuantity);
                }

            }

        }


    }
    public static void addShoppingList(ShoppingList item) {

        shoppingLists.add(item);
        System.out.println(item.getTitle()+" added");
    }

    public String displayAvailableItems() {
        StringBuilder rtn = new StringBuilder();
        System.out.println("Available items:\n" +
                "****************");
        for (GroceryItem_t05 item_ : groceryList5) {
            if (item_.getQuantity() > 0) {
                String item = item_.getItemName() + " " + "price: " + item_.getPrice() +
                        ", quantity: " + item_.getQuantity() + "\n";
                rtn.append(item);
            }


        }
        return rtn.toString();

    }

    public void removeItem(String item) {
        for (int i = 0; i < groceryList5.size(); i++) {
            if (groceryList5.get(i).getItemName().equals(item)) {
                groceryList5.remove(i);
                System.out.println("Removing " + item);
                i--;// if i-- not added it wont  delete next item if same name

            }
        }
    }

    public double displayList() {
        double totalPrice = 0;
        if (groceryList5.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (GroceryItem_t05 GroceryItem_t05 : groceryList5) {
                double price_ = GroceryItem_t05.getPrice();
                String category_ = GroceryItem_t05.getCategory();
                String itemName = GroceryItem_t05.getItemName();
                int quantity_ = GroceryItem_t05.getQuantity();
                totalPrice += price_;
                System.out.println(category_ + ": " + itemName + " price: " + price_ + " quantity: " + quantity_);
            }
        }

        return totalPrice;
    }


    public boolean checkItem(String item) {
        boolean found = false;
        System.out.print("Is " + item + " in grocery list? ");

        for (GroceryItem_t05 GroceryItem_t05 : groceryList5) {
            if (GroceryItem_t05.getItemName().equals(item)) {
                found = true;
            }
        }
        return found;

    }

    public void calculateTotalCost() {
        System.out.println("Calculating groceries total cost\n" +
                "**********************************");
        System.out.println("Total cost: " + displayList());//diplaylist returns total price.
        //total cost prints it
        System.out.println("**********************************");

    }

    public String displayByCategory(String category) {
        StringBuilder rtn = new StringBuilder();//make string builder so you can retrive string easily from loop (kind of list)
        System.out.println("Items in " + category + ":");
        for (GroceryItem_t05 GroceryItem_t05 : groceryList5) {
            if (GroceryItem_t05.getCategory().equals(category)) {
                String item = GroceryItem_t05.getItemName() + " " + "price: " + GroceryItem_t05.getPrice() +
                        ", quantity: " + GroceryItem_t05.getQuantity() + "\n";
                rtn.append(item);
            }
        }
        return rtn.toString();
    }

    public void displayShoppingLists(){
        System.out.println("Saved shopping lists:\n"+
                            "********************");
        for(ShoppingList shoppingList : shoppingLists){
            System.out.println(shoppingList.getTitle());
        }
    }

    public static void main_() {
        GroceryListManager_t05 groceryListManager = new GroceryListManager_t05();
        ShoppingList BBQ = new ShoppingList("BBQ");
        ShoppingList PARTY = new ShoppingList("PARTY");
        PARTY.addItem("Booze",2);
        PARTY.addItem("Candy",1);
        PARTY.addItem("Chips", 2);
        BBQ.addItem("Apple",3);
        BBQ.addItem("Salt",1);
        BBQ.addItem("Beer",12);
        BBQ.displayItems();
        PARTY.displayItems();
        BBQ.removeItem("Beer");
        BBQ.displayItems();
        groceryListManager.displayShoppingLists();

    }

    public static void main(String[] args) {
        GroceryListManager_t05.main_();

    }
}


