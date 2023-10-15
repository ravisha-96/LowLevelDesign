package StructuralDesignPatterns.BridgePattern.livingThings;

import StructuralDesignPatterns.BridgePattern.breathe.BreatheImplementor;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
