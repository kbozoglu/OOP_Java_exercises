package com.kb.oop.exercises4_1;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class Square extends Rectangle{

    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.length = side;
        super.width = side;
    }

    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }

    public String toString(){
        if(this.isFilled()) {
            return "This shape is a filled " + getColor() + " square " + "has side: " + getSide() + " Area:" + getArea() + " Perimeter: " + getPerimeter();
        }
        return "This shape is a unfilled " + getColor()+ " square " + "has side: " + getSide() + " Area:" + getArea() + " Perimeter: " + getPerimeter();
    }

}
