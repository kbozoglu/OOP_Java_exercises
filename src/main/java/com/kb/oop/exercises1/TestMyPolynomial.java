package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 23.07.2015.
 */
public class TestMyPolynomial {

    public static void main(String[] args){
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        //MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        // Can also invoke with an array
        double[] coeffs = new double[]{1.2, 3.4, 5.6, 7.8};
        MyPolynomial p2 = new MyPolynomial(coeffs);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.evaluate(2));
        System.out.println(p2.evaluate(1));
    }
}


