package VendingMachine;

import VendingMachine.states.IdleState;
import VendingMachine.states.State;

public class VendingMachine {
    State vendingMachineState;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State state) {
        vendingMachineState = state;
    }
}
