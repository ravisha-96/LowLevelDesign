package CreationalDesignPatterns.AbstractFactoryPattern.car;

import CreationalDesignPatterns.AbstractFactoryPattern.Constant;

public class LuxuryCar2 implements Car{
    public void getCar(){
        System.out.println(Constant.FERRARI);
    }    

    public String getTopSpeed(){
        return "350km/hr";
    }
}
