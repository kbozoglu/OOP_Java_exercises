package com.kb.oop.exercises4_1;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class Rectangle extends Shape{

    protected double width;
    protected double length;

    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    public Rectangle(){}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return super.toString() + " Rectangle " + "has width/length: " + getWidth()+ "/" +getLength() + " Area:" + getArea() + " Perimeter: " +getPerimeter();
    }
}
