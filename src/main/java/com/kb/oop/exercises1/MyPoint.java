package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint anotherPoint){
        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
