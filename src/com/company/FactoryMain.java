package com.company;

import com.company.factory.Shape;
import com.company.factory.ShapeFactory;

public class FactoryMain {

    public static void run(){
        Shape shape1 = ShapeFactory.getShape("square");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
