package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 18.07.2015.
 */
public class Circle {

    private double radius;
    private String color;

    // 1st constructor, which sets both radius and color to default
    public Circle(){
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default.
    public Circle(double r){
        radius = r;
        color = "red";
    }

    // 3rd constructor with given radius, and color but color default.
    public Circle(double r, String c){
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

     public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "radius: " + radius + "\n" + "color: " + color;
    }
}
