//Task 4: Quantity Tracking
//Extend the GroceryListManager class to track the quantity of each item in the list. Add the following methods:
//addItem(String item, double cost, String category, int quantity): This method should add the given item along
// with its quantity to the grocery list.
//updateQuantity(String item, int newQuantity): This method should update the
// quantity of the specified item in the grocery list.
//displayAvailableItems(): This method should display items along with their quantities that have a positive quantity.


import java.util.ArrayList;

public class GroceryListManager_t04 {
    private final ArrayList<GroceryItem_t04> groceryList4 = new ArrayList<>();

    public void addItem(String item, double price, String category, int quantity) {
        GroceryItem_t04 item_ = new GroceryItem_t04(item, price, category, quantity);
        groceryList4.add(item_);
        System.out.println(item + " added");

    }

    public void updateQuantity(String item, int newQuantity) {
        if (checkItem(item)) {
            System.out.println("true");
            System.out.println(item + " quantity");//check if item in list
            for (GroceryItem_t04 item_ : groceryList4) {
                if (item_.getItemName().equals(item)) {
                    item_.setQuantity(newQuantity);
                }

            }

        }
        ;

    }

    public String displayAvailableItems() {
        StringBuilder rtn = new StringBuilder();
        System.out.println("Available items:\n"+
                "****************");
        for (GroceryItem_t04 item_ : groceryList4) {
            if (item_.getQuantity() > 0) {
                String item = item_.getItemName() + " " + "price: " + item_.getPrice() +
                        ", quantity: " + item_.getQuantity() + "\n";
                rtn.append(item);
            }


        }
        return rtn.toString();

    }

    public void removeItem(String item) {
        for (int i = 0; i < groceryList4.size(); i++) {
            if (groceryList4.get(i).getItemName().equals(item)) {
                groceryList4.remove(i);
                System.out.println("Removing " + item);
                i--;// if i-- not added it wont  delete next item if same name

            }
        }
    }

    public double displayList() {
        double totalPrice = 0;
        if (groceryList4.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Items in list:");
            for (GroceryItem_t04 GroceryItem_t04 : groceryList4) {
                double price_ = GroceryItem_t04.getPrice();
                String category_ = GroceryItem_t04.getCategory();
                String itemName = GroceryItem_t04.getItemName();
                int quantity_ = GroceryItem_t04.getQuantity();
                totalPrice += price_;
                System.out.println(category_ + ": " + itemName + " price: " + price_ + " quantity: " + quantity_);
            }
        }

        return totalPrice;
    }


    public boolean checkItem(String item) {
        boolean found = false;
        System.out.print("Is " + item + " in grocery list? ");

        for (GroceryItem_t04 GroceryItem_t04 : groceryList4) {
            if (GroceryItem_t04.getItemName().equals(item)) {
                found = true;
            }
        }
        return found;

    }

    public void calculateTotalCost() {
        System.out.println("Calculating groceries total cost\n" +
                "**********************************");
        System.out.println("Total cost: " + displayList() + "");//diplaylist returns total price.
        //total cost prints it
        System.out.println("**********************************");

    }

    public String displayByCategory(String category) {
        StringBuilder rtn = new StringBuilder();
        System.out.println("Items in " + category + ":");
        for (GroceryItem_t04 GroceryItem_t04 : groceryList4) {
            if (GroceryItem_t04.getCategory().equals(category)) {
                String item = GroceryItem_t04.getItemName() + " " + "price: " + GroceryItem_t04.getPrice() +
                        ", quantity: " + GroceryItem_t04.getQuantity() + "\n";
                rtn.append(item);
            }
        }
        return rtn.toString();
    }


    public static void main_() {
        GroceryListManager_t04 groceryListManager = new GroceryListManager_t04();
        groceryListManager.addItem("Apple", 0.99, "Fruit", 10);
        groceryListManager.addItem("Apple", 0.99, "Fruit", 10);
        groceryListManager.addItem("Milk", 0.88, "Drink", 2);

        groceryListManager.addItem("Beer", 5, "Alcohol", 100);
        groceryListManager.addItem("Orange", 0.99, "Fruit", 50);

        System.out.println(groceryListManager.checkItem("Milk"));

        groceryListManager.calculateTotalCost();
        System.out.println(groceryListManager.displayByCategory("Fruit"));


        groceryListManager.removeItem("Apple");
        System.out.println(groceryListManager.checkItem("Apple"));
        groceryListManager.calculateTotalCost();
        groceryListManager.updateQuantity("Beer", 0);
        System.out.println(groceryListManager.displayAvailableItems());

    }

    public static void main(String[] args) {
        GroceryListManager_t04.main_();

    }


}



