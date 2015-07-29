package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 24.07.2015.
 */
public class TestMyTime {

    public static void main(String[] args){
        MyTime mt1 = new MyTime();
        mt1.setTime(2, 40, 37);
        System.out.println(mt1);
        System.out.println(mt1.nextSecond());
        System.out.println(mt1.nextMinute());
        System.out.println(mt1.nextHour());

        MyTime mt2 = new MyTime();
        mt2.setTime(22, 58, 59);
        System.out.println(mt2);
        System.out.println(mt2.nextSecond());
        System.out.println(mt2.nextMinute());
        System.out.println(mt2.nextHour());
    }
}
