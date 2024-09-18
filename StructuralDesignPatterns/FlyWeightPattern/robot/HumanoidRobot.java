package StructuralDesignPatterns.FlyWeightPattern.robot;

import StructuralDesignPatterns.FlyWeightPattern.sprites.Sprites;

public class HumanoidRobot implements Robot{
    private String type; // these should be private and only provide getters
    private Sprites body;

    public HumanoidRobot(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    public String getType(){
        return this.type;
    }

    public Sprites getBody(){
        return this.body;
    }
    @Override
    public void display(int x, int y){
        System.out.println(body.getGraphics() + " "+ x + " "+y);
    }
}
