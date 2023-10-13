package CreationalDesignPatterns.AbstractFactoryPattern;

import CreationalDesignPatterns.AbstractFactoryPattern.car.Car;
import CreationalDesignPatterns.AbstractFactoryPattern.factory1.CarFactory1;
import CreationalDesignPatterns.AbstractFactoryPattern.factory2.CarFactory2;


public class Main{
    public static void main(String[] args) {
        CarFactory2 carFactory2 = new CarFactory2();
        CarFactory1 luxuryCarFactory = carFactory2.getFactoryInstance(Constant.PREMIUM_CAR);
        Car carObj = luxuryCarFactory.getCar(5000000);
        carObj.getCar();
        System.out.println("Above car top speed is " + carObj.getTopSpeed());

        carObj = luxuryCarFactory.getCar(50000000);
        carObj.getCar();
        System.out.println("Above car top speed is " + carObj.getTopSpeed());

        //Get an ordinary car for price 8 lakh
        CarFactory1 ordinaryCarFactory = carFactory2.getFactoryInstance(Constant.ORDINARY_CAR);
        carObj = ordinaryCarFactory.getCar(800000);
        carObj.getCar();
        System.out.println("Above car top speed is " + carObj.getTopSpeed());
        carObj = ordinaryCarFactory.getCar(1200000);
        carObj.getCar();
        System.out.println("Above car top speed is " + carObj.getTopSpeed());

    }
}