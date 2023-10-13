package CreationalDesignPatterns.AbstractFactoryPattern.factory1;

import CreationalDesignPatterns.AbstractFactoryPattern.car.Car;
import CreationalDesignPatterns.AbstractFactoryPattern.car.OrdinaryCar1;
import CreationalDesignPatterns.AbstractFactoryPattern.car.OrdinaryCar2;

public class OrdinaryCarFactory implements CarFactory1{
    public Car getCar(int price){
        if(price< 1000000){
            return new OrdinaryCar1();
        }
        return new OrdinaryCar2();
    }
}
