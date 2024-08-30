public class GroceryItem_t05 {
    private final double price;
    private final String category;
    private final String itemName;
    private int quantity;

    public GroceryItem_t05(String item, double price, String category, int quantity) {
        itemName = item;
        this.price = price;
        this.category = category;
        if (quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;


    }


    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
        } else {
            this.quantity = quantity;
        }
        System.out.println("Quantity set: " + quantity+"\n");

    }
}