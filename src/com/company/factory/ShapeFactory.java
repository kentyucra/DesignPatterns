package com.company.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case "square": return new Square();
            case "rectangle": return new Rectangle();
            default: return null;
        }
    }
}
