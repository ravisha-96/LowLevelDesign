package VendingMachine.states;

import VendingMachine.VendingMachine;

public class IdleState implements State{

    @Override
    public void pressInsertCashButton(VendingMachine vm) {
        // TODO Auto-generated method stub
       System.out.println("Insert cash button pressed");
       vm.setVendingMachineState(new AcceptMoneyState());
    }

    @Override
    public void acceptCoin(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectProductButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProductButton'");
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
