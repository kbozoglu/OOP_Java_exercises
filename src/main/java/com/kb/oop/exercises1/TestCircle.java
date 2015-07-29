package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 18.07.2015.
 */
public class TestCircle {

    public static void main(String[] args){

        Circle c1 = new Circle();
        c1.setRadius(5.0);
        System.out.println("The radius of " + c1.getRadius() + " and the area of " + c1.getArea());


        Circle c2 = new Circle(2.0);
        c2.setColor("green");
        System.out.println("The radius of " + c2.getRadius() + "the color of " + c2.getColor() + " and the area of " + c2 .getArea());

        Circle c3 = new Circle(3.0, "yellow");
        System.out.println("The radius of " + c3.getRadius() + "the color of " + c3.getColor() + " and the area of " + c3 .getArea());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }
}
