package StructuralDesignPatterns.FlyWeightPattern.robot;

import StructuralDesignPatterns.FlyWeightPattern.sprites.Sprites;

public interface Robot {
    public void display(int x, int y);
    public String getType();
    public Sprites getBody();
}
