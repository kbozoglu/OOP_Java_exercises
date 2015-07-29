package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 21.07.2015.
 */
public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        return (imag == 0);
    }

    public boolean isImag(){
        return (imag != 0);
    }

    public boolean isEqual(double real, double imag){
        return ((this.real == real) && (this.imag == imag));
    }

    public boolean isEqual(MyComplex another){
        return ((real == another.real && (imag == another.imag)));
    }

    public double magnitude(){
        return Math.sqrt(real * real + imag * imag);
    }

    public double argumentInRadians(){
        return Math.atan2(imag, real);
    }

    public double argumentInDegrees(){
        return this.argumentInRadians() * 57.2957795;
    }

    public MyComplex conjugate(){
        MyComplex complex = new MyComplex(real, -1*imag);
        return complex;
    }

    public MyComplex add(MyComplex another){
        return new MyComplex(real + another.real, imag + another.imag);
    }

    public MyComplex subtract(MyComplex another){
        return new MyComplex(real - another.real, imag - another.imag);
    }

    public MyComplex multiplyWith(MyComplex another){
        return new MyComplex(real* another.real - imag*another.imag, real* another.imag - imag*another.real);
    }

    public MyComplex divideBy(MyComplex another){
        return new MyComplex(this.multiplyWith(another).getReal()/(another.real*another.real + another.imag*another.imag), this.multiplyWith(another).getImag()/(another.real*another.real + another.imag*another.imag));
    }


    public void setValue(double x, double y){
        real = x;
        imag = y;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString(){
        return "(" + real + "+" + imag + "i" + ")";
    }
}
