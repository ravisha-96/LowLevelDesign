package CreationalDesignPatterns.AbstractFactoryPattern.factory1;

import CreationalDesignPatterns.AbstractFactoryPattern.car.Car;

public interface CarFactory1 {
    Car getCar(int price);
}
