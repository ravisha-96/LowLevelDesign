package StructuralDesignPatterns.DecoratorPattern.CarExample.car;

public class Nexon extends Car{
    @Override
    public double price(){
        System.out.println("nexon price added");
        return 150.0;
    }
}
