package com.company.factory;

import javax.sound.midi.SysexMessage;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujar rectangulo");
    }
}
