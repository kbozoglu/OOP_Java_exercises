package com.kb.oop.exercises4_1;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class Circle extends Shape {
    protected double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return super.toString() + " circle " + "has radius: " + getRadius() + " Area:" + getArea() + " Perimeter: " +getPerimeter();
    }
}
