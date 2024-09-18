package BehavioralDesignPatterns.StateDesignPattern.vendingmachine;

//This contains all the operations
//In state machine diagram, all the arrows corrsponds to a operation
public abstract class VendingMachineState {

    abstract void pressInsertCashButton();
    abstract void insertCoin();
    abstract void pressSelectProductButton();
    abstract void chooseProduct();
    abstract void dispenseProduct();
}
