package StructuralDesignPatterns.DecoratorPattern.CarExample.decorator;

import StructuralDesignPatterns.DecoratorPattern.CarExample.car.Car;

public class FogLight extends CarDecorator{
    Car car;
    public FogLight(Car car){
        this.car = car;
    }
    @Override
    public double price(){
        return car.price()+10.0;
    }
}
