package com.kb.oop.exercises2;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
    }

    public String toString(){
        return "A Square with side = " + super.getLength() + " which is a subclass of " + super.toString();
    }

    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }
}
