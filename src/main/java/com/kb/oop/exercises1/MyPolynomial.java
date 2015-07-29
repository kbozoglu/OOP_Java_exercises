package com.kb.oop.exercises1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by kbozoglu on 23.07.2015.
 */
public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename){
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        try{
//            //in = new Scanner(new File(filename));
//        }
//        catch(FileNotFoundException e){
//            e.printStackTrace();
//        }
//        int degree = in.nextInt();
//        coeffs = new double[degree + 1];
//        for(int i = 0; i < coeffs.length; ++i){
//            coeffs[i] = in.nextDouble();
//        }
    }

    public int getDegree(){
        return coeffs.length - 1;
    }

    public double evaluate(double x){
        double result = 0;
        for(int i = coeffs.length - 1; i > 0 ; --i){
            result = result + coeffs[i] * Math.pow(x, i);
        }
        return result + coeffs[0];
    }

    public String toString(){{
        String result = "";
        for(int i = coeffs.length - 1; i > 0 ; --i){
                result = result + coeffs[i] + "x^" + i + " + ";
        }
        return result + coeffs[0];
    }


    }


}