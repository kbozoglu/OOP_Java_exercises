package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 21.07.2015.
 */
public class MyTriangle {

    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        p1.setX(x1);
        p1.setX(y1);
        p2.setX(x2);
        p2.setX(y2);
        p3.setX(x3);
        p3.setX(y3);
    }


    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String toString(){
        return "Triangle @ " + p1 +  " " + p2 + " " + p3;
    }

    public double getPerimeter(){
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public void printType(){
        if((p1.distance(p2) == p1.distance(p3)) && (p1.distance(p3) == p2.distance(p3)) ){
           System.out.println("equaliteral");
        }
        else if((p1.distance(p2) == p1.distance(p3)) || (p1.distance(p3) == p2.distance(p3)) || (p1.distance(p2) == p2.distance(p3))) {
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalane");
        }
    }
}
