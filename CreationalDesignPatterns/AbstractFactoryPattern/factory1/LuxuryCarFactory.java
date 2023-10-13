package CreationalDesignPatterns.AbstractFactoryPattern.factory1;

import CreationalDesignPatterns.AbstractFactoryPattern.car.Car;
import CreationalDesignPatterns.AbstractFactoryPattern.car.LuxuryCar1;
import CreationalDesignPatterns.AbstractFactoryPattern.car.LuxuryCar2;

public class LuxuryCarFactory implements CarFactory1{
    public Car getCar(int price){
        if( price < 15500000){

            return new LuxuryCar1();
        }
        return new LuxuryCar2();
    }
}
