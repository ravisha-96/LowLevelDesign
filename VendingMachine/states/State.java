package VendingMachine.states;

import VendingMachine.VendingMachine;

public interface State {

  void pressInsertCashButton(VendingMachine vm);
  void acceptCoin(VendingMachine vm);
  void selectProductButton(VendingMachine vm);
  void chooseProduct(VendingMachine vm);
  void dispenseProduct(VendingMachine vm);
} 
