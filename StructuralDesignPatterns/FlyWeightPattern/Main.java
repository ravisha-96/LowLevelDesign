package StructuralDesignPatterns.FlyWeightPattern;

import StructuralDesignPatterns.FlyWeightPattern.robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot humanoidRobot1 = RoboticFactory.createRobot(RobotConstant.HUMANOID);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                humanoidRobot1.display(i, j);
            }
        }

        Robot dogRobot1 = RoboticFactory.createRobot(RobotConstant.DOG);
        dogRobot1.display(2, 2);

        for(int i = 3; i < 6; i++) {
            for(int j = 0; j < 3; j++) {
                dogRobot1.display(i, j);
            }
        }

        //Here we are creating only one object of DogRobot and HumanoidRobot
        //And Factory is acting as a cache for the robots

        System.out.println(humanoidRobot1.getType());
        System.out.println(humanoidRobot1.getBody().getGraphics());

        System.out.println(dogRobot1.getType());
        System.out.println(dogRobot1.getBody().getGraphics());
    }
}
