package CreationalDesignPatterns.FactoryPattern.shape;

public class Triangle implements Shape{
    @Override
    public void draw(){
        System.out.println("triangle is drawn");
    }
}
