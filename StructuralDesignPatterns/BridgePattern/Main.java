package StructuralDesignPatterns.BridgePattern;

import StructuralDesignPatterns.BridgePattern.breathe.LandBreathe;
import StructuralDesignPatterns.BridgePattern.breathe.TreeBreathe;
import StructuralDesignPatterns.BridgePattern.breathe.WaterBreathe;
import StructuralDesignPatterns.BridgePattern.livingThings.Dog;
import StructuralDesignPatterns.BridgePattern.livingThings.Fish;
import StructuralDesignPatterns.BridgePattern.livingThings.LivingThings;
import StructuralDesignPatterns.BridgePattern.livingThings.Neem;

public class Main {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreathe());
        dog.breatheProcess();

        LivingThings fish = new Fish(new WaterBreathe());
        fish.breatheProcess();

        LivingThings neem = new Neem(new TreeBreathe());
        neem.breatheProcess();
    }
}
