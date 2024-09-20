package VendingMachine.states;

import VendingMachine.VendingMachine;

public class AcceptMoneyState implements State{

    @Override
    public void pressInsertCashButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInsertCashButton'");
    }

    @Override
    public void acceptCoin(VendingMachine vm) {
        // TODO Auto-generated method stub
        System.out.println("coin accepted");
    }

    @Override
    public void selectProductButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        System.out.println("Product button selected");
        vm.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public void dispenseProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }
    
}
