package StructuralDesignPatterns.DecoratorPattern.CarExample.decorator;

import StructuralDesignPatterns.DecoratorPattern.CarExample.car.Car;

public class SeatCover extends CarDecorator{
    Car car;
    public SeatCover(Car car){
        this.car = car;
    }
    @Override
    public double price(){
        // System.out.print("seatCover me aaya");
        System.out.println("seatCover price added");
        return car.price() + 8.0;
    }
}
