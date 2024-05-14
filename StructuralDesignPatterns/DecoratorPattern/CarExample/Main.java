package StructuralDesignPatterns.DecoratorPattern.CarExample;

import StructuralDesignPatterns.DecoratorPattern.CarExample.car.Car;
import StructuralDesignPatterns.DecoratorPattern.CarExample.car.Nexon;
import StructuralDesignPatterns.DecoratorPattern.CarExample.car.Punch;
import StructuralDesignPatterns.DecoratorPattern.CarExample.decorator.FogLight;
import StructuralDesignPatterns.DecoratorPattern.CarExample.decorator.SeatCover;

public class Main {
    public static void main(String[] args){

        //I want nexon with FogLight and SeatCover
        Car nexon = new FogLight(new SeatCover(new Nexon()));
        System.out.println(nexon.price());
        System.out.println();
        //I want punch with seatcover only
        Car punch = new SeatCover(new Punch());
        System.out.println(punch.price());
        System.out.println();
        //I want punch with SeatCover, and foglight
        Car punchTopModel = new SeatCover(new FogLight(new Punch()));
        System.out.println(punchTopModel.price());
        System.out.println();
    }
}
