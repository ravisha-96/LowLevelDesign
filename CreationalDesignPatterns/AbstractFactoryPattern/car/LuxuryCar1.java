package CreationalDesignPatterns.AbstractFactoryPattern.car;

import CreationalDesignPatterns.AbstractFactoryPattern.Constant;

public class LuxuryCar1 implements Car{
    public void getCar(){
        System.out.println(Constant.MERCEDES);
    }    

    public String getTopSpeed(){
        return "300km/hr";
    }
}