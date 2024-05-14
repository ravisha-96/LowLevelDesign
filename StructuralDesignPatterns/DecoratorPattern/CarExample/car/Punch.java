package StructuralDesignPatterns.DecoratorPattern.CarExample.car;

public class Punch extends Car{
    @Override
    public double price(){
        System.out.println("Punch price added");
        return 100.0;
    }
}
