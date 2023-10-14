package StructuralDesignPatterns.AdapterPattern;

import StructuralDesignPatterns.AdapterPattern.adaptee.WeightMachineImpl;
import StructuralDesignPatterns.AdapterPattern.adapter.WeightMachineAdapter;
import StructuralDesignPatterns.AdapterPattern.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKg());
    }
}
