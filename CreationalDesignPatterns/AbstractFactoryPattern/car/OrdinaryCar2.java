package CreationalDesignPatterns.AbstractFactoryPattern.car;

import CreationalDesignPatterns.AbstractFactoryPattern.Constant;

public class OrdinaryCar2 implements Car{
    public void getCar(){
        System.out.println(Constant.NEXON);
    }

    public String getTopSpeed(){
        return "160km/hr";
    }
}
