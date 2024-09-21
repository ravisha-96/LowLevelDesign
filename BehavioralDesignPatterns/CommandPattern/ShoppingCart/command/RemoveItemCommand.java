package BehavioralDesignPatterns.CommandPattern.ShoppingCart.command;

import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.CartItem;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.ShoppingCart;

public class RemoveItemCommand implements Command{
    ShoppingCart shoppingCart;
    CartItem cartItem;

    public RemoveItemCommand(ShoppingCart shoppingCart,CartItem cartItem) {
        this.shoppingCart = shoppingCart;
        this.cartItem = cartItem;
    }

    @Override
    public void execute() {
        shoppingCart.removeItemFromCart(cartItem);
    }
    
}
