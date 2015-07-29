package com.kb.oop.exercises4_1;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public abstract double getArea();
    public abstract double getPerimeter();


    public Shape(){}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if(isFilled()) {
            return "This shape is a filled " + getColor();
        }
        return "This shape is a unfilled " + getColor();
    }

}
