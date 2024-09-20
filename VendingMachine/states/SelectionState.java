package VendingMachine.states;

import VendingMachine.VendingMachine;

public class SelectionState implements State{

    @Override
    public void pressInsertCashButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInsertCashButton'");
    }

    @Override
    public void acceptCoin(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptCoin'");
    }

    @Override
    public void selectProductButton(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProductButton'");
    }

    @Override
    public void chooseProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        System.out.println("product choosen");
        vm.setVendingMachineState(new DispenseProduct());
    }

    @Override
    public void dispenseProduct(VendingMachine vm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }
    
}
