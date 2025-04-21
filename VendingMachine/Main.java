package VendingMachine;

import VendingMachine.states.IdleState;
import VendingMachine.states.State;

public class Main {
    public static void main(String[] args) {
        
        VendingMachine vm = new VendingMachine();
        System.out.println("Vending machine is in " + vm.getVendingMachineState().getClass());

        State state = vm.getVendingMachineState();

        //Let us try an invalid method on the current Idle state
        try{
            state.dispenseProduct(vm);
        }catch(UnsupportedOperationException ex) {
            System.out.println("operation is not supported " + ex.getMessage());
        }

        vm.getVendingMachineState().pressInsertCashButton(vm);
        vm.getVendingMachineState().acceptCoin(vm);
        vm.getVendingMachineState().selectProductButton(vm);
        vm.getVendingMachineState().chooseProduct(vm);
        vm.getVendingMachineState().dispenseProduct(vm);
    
    }
}
