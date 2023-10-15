package StructuralDesignPatterns.BridgePattern.livingThings;

import StructuralDesignPatterns.BridgePattern.breathe.BreatheImplementor;

public class Dog extends LivingThings{
    public Dog(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }
    public void breatheProcess(){
        breatheImplementor.breatheProcess();
    }
}
