package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class TestBall {

    public static void main(String[] args){
        Ball b1 = new Ball(2, 3, 1, 5, 90);
        System.out.println(b1);

        b1.move();
        System.out.println(b1);

        b1.reflectHorizontal();
        System.out.println(b1);

        b1.reflectVertical();
        System.out.println(b1);
    }
}
