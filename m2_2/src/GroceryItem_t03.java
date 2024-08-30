public class GroceryItem_t03 {
    private final double price;
    private final String category;
    private final String itemName;

    public GroceryItem_t03(String item, double price, String category) {
        itemName = item;
        this.price = price;
        this.category = category;


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

}