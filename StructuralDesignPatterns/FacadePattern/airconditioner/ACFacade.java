package StructuralDesignPatterns.FacadePattern.airconditioner;

public class ACFacade {
    ACExternalUnit externalUnit;
    ACInternUnit internUnit;

    ACFacade(){
        externalUnit = new ACExternalUnit();
        internUnit = new ACInternUnit();
    }

    public void turnOnButtonClicked(){
        internUnit.acceptUserOnCmd();
        externalUnit.checkVoltage();
        externalUnit.consutmeNitrogen();
        externalUnit.startCondenser();
        System.out.println("Finally AC turned on");
    }
}
