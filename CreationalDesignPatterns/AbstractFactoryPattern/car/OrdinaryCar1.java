package CreationalDesignPatterns.AbstractFactoryPattern.car;

import CreationalDesignPatterns.AbstractFactoryPattern.Constant;

public class OrdinaryCar1 implements Car{
    public void getCar(){
        System.out.println(Constant.PUNCH);
    }

    public String getTopSpeed(){
        return "120km/hr";
    }
}
