package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 21.07.2015.
 */
public class TestMyTriangle {

    public static void main(String[] args){

        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,4);
        MyPoint p3 = new MyPoint(5,0);
        MyTriangle t1 = new MyTriangle(p1, p2, p3);

        System.out.println(t1 + " and its perimeter is: " + t1.getPerimeter());
        t1.printType();
    }
}
