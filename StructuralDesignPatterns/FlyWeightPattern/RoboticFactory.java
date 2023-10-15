package StructuralDesignPatterns.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

import StructuralDesignPatterns.FlyWeightPattern.robot.DogRobot;
import StructuralDesignPatterns.FlyWeightPattern.robot.HumanoidRobot;
import StructuralDesignPatterns.FlyWeightPattern.robot.Robot;
import StructuralDesignPatterns.FlyWeightPattern.sprites.DogSprites;
import StructuralDesignPatterns.FlyWeightPattern.sprites.HumanSprites;
import StructuralDesignPatterns.FlyWeightPattern.sprites.Sprites;

public class RoboticFactory {
    private static Map<String, Robot> roboticObjectCache = new HashMap<>();

    public static Robot createRobot(String robotType){
        if( roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        if(robotType.equals(RobotConstant.HUMANOID)){
            Sprites humanSprite = new HumanSprites();
            HumanoidRobot humanoidRobot = new HumanoidRobot(RobotConstant.HUMANOID, humanSprite);
            roboticObjectCache.put(RobotConstant.HUMANOID, humanoidRobot);
        }

        if(robotType.equals(RobotConstant.DOG)){
            Sprites dogSprite = new DogSprites();
            DogRobot dogRobot = new DogRobot(RobotConstant.DOG, dogSprite);
            roboticObjectCache.put(RobotConstant.DOG, dogRobot);
        }
        return roboticObjectCache.get(robotType);
    }
}
