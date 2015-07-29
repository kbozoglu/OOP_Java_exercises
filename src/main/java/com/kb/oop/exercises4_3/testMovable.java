package com.kb.oop.exercises4_3;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class testMovable {
    public static void main(String[] args){
        Movable m1 = new MovablePoint(5, 5, 6, 10);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, -3, 20); // upcast
        Movable m3 = new MovableCircle(20, (MovablePoint) m1); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
