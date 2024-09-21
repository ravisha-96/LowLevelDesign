package BehavioralDesignPatterns.CommandPattern.ShoppingCart.invoker;

import BehavioralDesignPatterns.CommandPattern.ShoppingCart.command.Command;

public class UserInterface {
    Command command;

    public UserInterface() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
