package StructuralDesignPatterns.FlyWeightPattern.sprites;

public class HumanSprites implements Sprites{
    public static final String HUMAN_GRAPHICS = "^";

    @Override
    public String getGraphics() {
        // TODO Auto-generated method stub
        return HUMAN_GRAPHICS;
    }

}
