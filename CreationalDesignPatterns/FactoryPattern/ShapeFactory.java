package CreationalDesignPatterns.FactoryPattern;

import CreationalDesignPatterns.FactoryPattern.shape.Shape;

public class ShapeFactory {
    Shape shape;
    ShapeFactory(Shape shape){
        this.shape =shape;
    }

    public void draw(){
        shape.draw();
    }
}
