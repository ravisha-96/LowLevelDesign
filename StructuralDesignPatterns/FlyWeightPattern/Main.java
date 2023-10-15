package StructuralDesignPatterns.FlyWeightPattern;

import StructuralDesignPatterns.FlyWeightPattern.robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot humanoidRobot1 = RoboticFactory.createRobot(RobotConstant.HUMANOID);
        humanoidRobot1.display(0, 0);

        Robot humanoidRobot2 = RoboticFactory.createRobot(RobotConstant.HUMANOID);
        humanoidRobot2.display(1, 1);

        Robot dogRobot1 = RoboticFactory.createRobot(RobotConstant.DOG);
        dogRobot1.display(2, 2);

        Robot dogRobot2 = RoboticFactory.createRobot(RobotConstant.DOG);
        dogRobot2.display(4, 4);

        //Here we are creating only one object of DogRobot and HumanoidRobot
        //And Factory is acting as a cache for the robots

        System.out.println(humanoidRobot1.getType());
        System.out.println(humanoidRobot1.getBody());

        System.out.println(dogRobot1.getType());
        System.out.println(dogRobot1.getBody());
    }
}
