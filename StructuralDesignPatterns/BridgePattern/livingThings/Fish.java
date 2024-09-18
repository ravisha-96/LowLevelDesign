package StructuralDesignPatterns.BridgePattern.livingThings;

import StructuralDesignPatterns.BridgePattern.breathe.BreatheImplementor;

// public class Fish extends LivingThings{
//     public Fish(BreatheImplementor breatheImplementor){
//         super(breatheImplementor);
//     }

//     public void breatheProcess(){
//         breatheImplementor.breatheProcess();
//     }
// }

public class Fish implements LivingThings{
    BreatheImplementor breatheImplementor;

    public Fish(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    @Override
    public void breatheProcess(){
        breatheImplementor.breatheProcess();
    }
    
} 