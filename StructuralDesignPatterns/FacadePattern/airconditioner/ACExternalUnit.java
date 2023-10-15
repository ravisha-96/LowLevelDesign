package StructuralDesignPatterns.FacadePattern.airconditioner;

public class ACExternalUnit {
    
    public void checkVoltage(){
        System.out.println("checking voltage");
    }

    public void consutmeNitrogen(){
        System.out.println("consuming nitrogen");
    }

    public void startCondenser(){
        System.out.println("starting condenser");
    }
}
