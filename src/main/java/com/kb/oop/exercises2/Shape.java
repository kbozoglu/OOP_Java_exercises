package com.kb.oop.exercises2;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of " + color + "and filled: " + isFilled();
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
}
