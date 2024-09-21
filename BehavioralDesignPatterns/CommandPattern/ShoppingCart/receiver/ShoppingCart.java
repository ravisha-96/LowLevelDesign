package BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver;


import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Set<CartItem> cartItemList;

    public ShoppingCart() {
        cartItemList = new HashSet<>();
    }

    public void addItemToCart(CartItem item) {
        cartItemList.add(item);
        System.out.println("item added to cart");
    }

    public void removeItemFromCart(CartItem item) {
        cartItemList.remove(item);
        System.out.println("item removed from the cart");
    }

    public void updateQuantity(CartItem item) {
        System.out.println("Item updated with quantity: ");
        cartItemList.remove(item);
        cartItemList.add(item);
    }

    public void listCartItems() {
        System.out.println(cartItemList);
    }
}
