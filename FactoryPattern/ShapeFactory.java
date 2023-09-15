package FactoryPattern;

import FactoryPattern.shape.Shape;

public class ShapeFactory {
    Shape shape;
    ShapeFactory(Shape shape){
        this.shape =shape;
    }

    public void draw(){
        shape.draw();
    }
}
