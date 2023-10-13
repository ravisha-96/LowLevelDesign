package CreationalDesignPatterns.FactoryPattern;

import CreationalDesignPatterns.FactoryPattern.shape.Circle;
import CreationalDesignPatterns.FactoryPattern.shape.Shape;
import CreationalDesignPatterns.FactoryPattern.shape.Square;
import CreationalDesignPatterns.FactoryPattern.shape.Triangle;

public class ShapeFactory {
    // Shape shape;
    // ShapeFactory(Shape shape){
    //     this.shape =shape;
    // }

    // public void draw(){
    //     shape.draw();
    // }

    public Shape getShapeInstance(String shapeType){
        if( shapeType.equals(FactoryPatternConstant.CIRCLE)){
            return new Circle();
        }
        if( shapeType.equals(FactoryPatternConstant.SQUARE)){
            return new Square();
        }
        if( shapeType.equals(FactoryPatternConstant.TRIANGLE)){
            return new Triangle();
        }
        return null;
    }
}
