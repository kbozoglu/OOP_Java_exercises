package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class TestMyPoint {

    public static void main(String[] args){

        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint();
        MyPoint p3 = new MyPoint();
        p2.setXY(6, 8);
        p3.setX(p1.getX());
        p3.setY(p2.getY());


        System.out.println(p1.distance(3, 2));
        System.out.println("Distance between point " + p3 + " and point " + p1 + " is " + p3.distance(p1));
        System.out.println("Distance between point " + p3 + " and point " + p2 + " is " + p3.distance(p2));

        MyPoint[] points = new MyPoint[10];

        for(int i = 0; i < 10; i++){
            points[i] = new MyPoint(i + 1, i + 1);
            System.out.println(points[i]);
        }
    }
}
