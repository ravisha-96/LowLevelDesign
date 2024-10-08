package StructuralDesignPatterns.BridgePattern.livingThings;

import StructuralDesignPatterns.BridgePattern.breathe.BreatheImplementor;

// public class Neem extends LivingThings{
//     public Neem(BreatheImplementor breatheImplementor){
//         super(breatheImplementor);
//     }

//     public void breatheProcess(){
//         breatheImplementor.breatheProcess();
//     }
// }

public class Neem implements LivingThings{
    BreatheImplementor breatheImplementor;

    public Neem(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    @Override
    public void breatheProcess(){
        breatheImplementor.breatheProcess();
    }
    
} 