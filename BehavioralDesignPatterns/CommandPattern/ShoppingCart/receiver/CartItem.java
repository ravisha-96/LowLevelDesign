package BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver;

public class CartItem {
    Item item;
    int quantity;
    

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return item.name + ":" + quantity;
    }
}
