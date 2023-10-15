package StructuralDesignPatterns.BridgePattern.breathe;

public class TreeBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess(){
        System.out.println("Breathe through leaves, absorb carbon dioxide, release oxygen");
    }
}
