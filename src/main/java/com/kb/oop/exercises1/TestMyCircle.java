package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class TestMyCircle {

    public static void main(String[] args){

        MyPoint p1 = new MyPoint(1,1);
        MyCircle circle1  = new MyCircle(2, 3, 5);
        MyCircle circle2 = new MyCircle(p1, circle1.getCenterX());
        MyCircle circle3 = new MyCircle(p1, 8);

        System.out.println(circle1.toString() + " Area=" + circle1.getArea());
        System.out.println(circle2.toString() + " Area=" + circle2.getArea());
        System.out.println(circle3.toString() + " Area=" + circle3.getArea());
    }

}
