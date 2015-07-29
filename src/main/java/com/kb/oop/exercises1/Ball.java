package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 25.07.2015.
 */
public class Ball {

    private double x;
    private double y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(double x, double y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(direction);
        this.yDelta = speed * Math.sin(direction);
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta *= (-1);
    }
    public void reflectVertical(){
        yDelta *= (-1);
    }

    public String toString(){
        return "Ball at (" + x + "," + y + ")" + " of velocity (" + xDelta + "," + yDelta + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getxDelta() {
        return xDelta;
    }

    public void setxDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public void setyDelta(double yDelta) {
        this.yDelta = yDelta;
    }
}

//TODO: class container
//TODO: 1.14 Ball and Player