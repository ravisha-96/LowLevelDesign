package StructuralDesignPatterns.AdapterPattern.adapter;

import StructuralDesignPatterns.AdapterPattern.adaptee.WeightMachineImpl;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachineImpl machineImpl;

    public WeightMachineAdapterImpl(WeightMachineImpl machineImpl){
        this.machineImpl = machineImpl;
    }

    public double getWeightInKg(){
        return 0.45 * machineImpl.getWeightInPound();
    }
}
