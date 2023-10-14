package StructuralDesignPatterns.DecoratorPattern.CarExample.decorator;

import StructuralDesignPatterns.DecoratorPattern.CarExample.decorator.car.Car;
import StructuralDesignPatterns.DecoratorPattern.CarExample.decorator.car.Nexon;
import StructuralDesignPatterns.DecoratorPattern.CarExample.decorator.car.Punch;

public class Main {
    public static void main(String[] args){

        //I want nexon with FogLight and SeatCover
        Car nexon = new FogLight(new SeatCover(new Nexon()));
        System.out.println(nexon.price());
        //I want punch with seatcover only
        Car punch = new SeatCover(new Punch());
        System.out.println(punch.price());
        //I want punch with SeatCover, and foglight
        Car punchTopModel = new SeatCover(new FogLight(new Punch()));
        System.out.println(punchTopModel.price());
    }
}
