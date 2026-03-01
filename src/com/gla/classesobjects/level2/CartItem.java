public class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
        else
            System.out.println("Not enough quantity");
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {

        CartItem item = new CartItem();

        item.itemName = "Laptop";
        item.price = 50000;

        item.addItem(2);
        item.removeItem(1);

        item.display();
    }
}