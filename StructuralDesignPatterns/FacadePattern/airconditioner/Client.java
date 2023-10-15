package StructuralDesignPatterns.FacadePattern.airconditioner;

public class Client {

    public static void main(String[] args) {
        ACFacade obj = new ACFacade();
        obj.turnOnButtonClicked();
    }
    
}
