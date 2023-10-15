package StructuralDesignPatterns.AdapterPattern;

import StructuralDesignPatterns.AdapterPattern.adaptee.WeightMachineImpl;
import StructuralDesignPatterns.AdapterPattern.adapter.WeightMachineAdapter;
import StructuralDesignPatterns.AdapterPattern.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        //Client only understand weight in kg
        //WeightMachine provides the weight in pounds
        //Adapter converts the weights from pound to kg
        //Client uses adapter to get the weight in kg
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKg());
    }
}
