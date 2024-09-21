package BehavioralDesignPatterns.CommandPattern.ShoppingCart.command;

import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.CartItem;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.ShoppingCart;

public class AddItemCommand implements Command{
    ShoppingCart shoppingCart;
    CartItem cartItem;

    public AddItemCommand(ShoppingCart shoppingCart, CartItem cartItem) {
        this.shoppingCart = shoppingCart;
        this.cartItem = cartItem;
    }

    @Override
    public void execute() {
        System.out.println("Call method corresponding to add Item on cartIteam");
        shoppingCart.addItemToCart(cartItem);
    }
    
}
