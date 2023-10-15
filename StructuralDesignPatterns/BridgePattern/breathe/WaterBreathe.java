package StructuralDesignPatterns.BridgePattern.breathe;

public class WaterBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess(){
        System.out.println("Breathe through gills, absorb oxygen, exhale carbod dioxide");
    }
}
