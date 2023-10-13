package CreationalDesignPatterns.AbstractFactoryPattern.factory2;

import CreationalDesignPatterns.AbstractFactoryPattern.Constant;
import CreationalDesignPatterns.AbstractFactoryPattern.factory1.CarFactory1;
import CreationalDesignPatterns.AbstractFactoryPattern.factory1.LuxuryCarFactory;
import CreationalDesignPatterns.AbstractFactoryPattern.factory1.OrdinaryCarFactory;


//This is the outermost factory
public class CarFactory2 {

    public CarFactory1 getFactoryInstance(String carType){
        if( carType.equals(Constant.PREMIUM_CAR)){
            return new LuxuryCarFactory();
        }
        if( carType.equals(Constant.ORDINARY_CAR)){
            return new OrdinaryCarFactory();
        }
        return null;
    }
}
