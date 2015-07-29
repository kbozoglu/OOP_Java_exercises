package com.kb.oop.exercises3;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class testLine {

    public static void main(String[] args){
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());

        Point p1 = new Point(1,1);
        Point p2 = new Point(3,3);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());


    }
}
