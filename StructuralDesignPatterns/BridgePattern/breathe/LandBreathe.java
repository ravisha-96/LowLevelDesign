package StructuralDesignPatterns.BridgePattern.breathe;

public class LandBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess(){
        System.out.println("breathe through nose, inhale oxygen, exhale carbod dioxide");
    }
}
