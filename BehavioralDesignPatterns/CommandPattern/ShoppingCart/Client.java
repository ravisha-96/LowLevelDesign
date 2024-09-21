package BehavioralDesignPatterns.CommandPattern.ShoppingCart;

import BehavioralDesignPatterns.CommandPattern.ShoppingCart.command.AddItemCommand;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.command.ModifyQuantityCommand;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.command.RemoveItemCommand;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.invoker.UserInterface;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.CartItem;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.Item;
import BehavioralDesignPatterns.CommandPattern.ShoppingCart.receiver.ShoppingCart;

public class Client {
    public static void main(String[] args) {
        //Create Cart Items
        CartItem item1 = new CartItem(new Item("cashew", 340), 1);
        CartItem item2 = new CartItem(new Item("pista", 279), 2);
        CartItem item3 = new CartItem(new Item("badam", 349), 1);

        //Create ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        //Add to cart
        //We can only access Invoker, rest will be hidden
        UserInterface userInterface = new UserInterface();

        //On Add item button on the UI following lines will get executed
        //If Item is selected
        userInterface.setCommand(new AddItemCommand(shoppingCart, item1));
        userInterface.pressButton();
        
        //If item2 is selected
        userInterface.setCommand(new AddItemCommand(shoppingCart, item2));
        userInterface.pressButton();
        shoppingCart.listCartItems();

        //If item3 is selected
        userInterface.setCommand(new AddItemCommand(shoppingCart, item3));
        userInterface.pressButton();
        shoppingCart.listCartItems();

        //remove from cart
        userInterface.setCommand(new RemoveItemCommand(shoppingCart, item2));
        userInterface.pressButton();
        shoppingCart.listCartItems();

        //modify the quantity of a cartItem
        //Let us for now assume modify item is same as add operation
        CartItem item4 = new CartItem(new Item("pista", 3), 4);
        userInterface.setCommand(new ModifyQuantityCommand(shoppingCart, item4));
        userInterface.pressButton();
        shoppingCart.listCartItems();
        System.out.println("operation completed");
    }
}
