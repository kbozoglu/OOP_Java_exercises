package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 21.07.2015.
 */
public class MyComplexApp {

    public static void main(String[] args){

        MyComplex cn1 = new MyComplex(1.1, 2.2);
        MyComplex cn2 = new MyComplex(3.3, 4.4);

        System.out.println(cn1);
        System.out.println(cn1.isReal());
        System.out.println(cn1.isImag());
        System.out.println(cn1.isEqual(cn2));

        System.out.println(cn2);
        System.out.println(cn2.isReal());
        System.out.println(cn2.isImag());

        System.out.println(cn1.add(cn2));
        System.out.println(cn1.subtract(cn2));
        System.out.println(cn1.multiplyWith(cn2));
        System.out.println(cn1.divideBy(cn2));

        System.out.println(cn1.argumentInDegrees());
        System.out.println(cn1.argumentInRadians());

    }


}
