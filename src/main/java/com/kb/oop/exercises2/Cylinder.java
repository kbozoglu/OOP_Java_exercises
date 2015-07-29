package com.kb.oop.exercises2;

import com.kb.oop.exercises1.Circle;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class Cylinder extends Circle {

    private double height;//private variable of only subclass

    // Constructor with default color, radius and height;
    public Cylinder(){
        super();
        height = 1.0;
    }
    // Constructor with default color, radius but given height;
    public Cylinder(double height){
        super();
        this.height = height;
    }
    // Constructor with default color but given radius and height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }
    public double getBaseArea(){
        return super.getArea();
    }
    @Override
    public double getArea(){
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * getHeight();
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "height: " + height;
    }

    public double getHeight() {
        return height;
    }
}
