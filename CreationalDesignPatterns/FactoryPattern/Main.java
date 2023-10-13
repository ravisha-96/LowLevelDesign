package CreationalDesignPatterns.FactoryPattern;

import CreationalDesignPatterns.FactoryPattern.shape.Circle;
import CreationalDesignPatterns.FactoryPattern.shape.Square;
import CreationalDesignPatterns.FactoryPattern.shape.Triangle;


//Not very clear why we use factory pattern
public class Main{
    public static void main(String[] args){
        // ShapeFactory circle = new ShapeFactory(new Circle());
        // circle.draw();
        // ShapeFactory sqaure = new ShapeFactory(new Square());
        // sqaure.draw();
        // ShapeFactory triangle = new ShapeFactory(new Triangle());
        // triangle.draw();
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShapeInstance(FactoryPatternConstant.CIRCLE).draw();
        shapeFactory.getShapeInstance(FactoryPatternConstant.SQUARE).draw();
        shapeFactory.getShapeInstance(FactoryPatternConstant.TRIANGLE).draw();
        
    }
}
