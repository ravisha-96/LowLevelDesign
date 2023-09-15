package FactoryPattern;

import FactoryPattern.shape.Circle;
import FactoryPattern.shape.Square;
import FactoryPattern.shape.Triangle;


//Not very clear why we use factory pattern
public class Main{
    public static void main(String[] args){
        ShapeFactory circle = new ShapeFactory(new Circle());
        circle.draw();
        ShapeFactory sqaure = new ShapeFactory(new Square());
        sqaure.draw();
        ShapeFactory triangle = new ShapeFactory(new Triangle());
        triangle.draw();
    }
}
