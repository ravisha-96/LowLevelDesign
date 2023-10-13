package CreationalDesignPatterns.FactoryPattern.shape;

public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawn circle");
    }
}
