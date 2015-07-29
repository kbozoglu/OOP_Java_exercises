package com.kb.oop.exercises4_1;


import java.util.Random;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class TestAllShapes {

    public static void main(String[] args){

//        Shape s1 = new Circle("RED", false, 5.5);  // Upcast Circle to Shape
//        System.out.println(s1);                    // which version?
//        System.out.println(s1.getArea());          // which version?
//        System.out.println(s1.getPerimeter());     // which version?
//        System.out.println(s1.getColor());
//        System.out.println(s1.isFilled());
//        //System.out.println(s1.getRadius());
//
//
//
////        Square s1 = new Square(5);
////        s1.setColor("yellow");
////        s1.setFilled(true);
////        System.out.println(s1);
////        s1.setLength(3);
////        System.out.println(s1.getLength());
////        System.out.println(s1.getSide());
//
//
//        Rectangle r1 = new Rectangle("green", true, 3, 4);
//        System.out.println(r1);
//
//        Circle c1 = new Circle("red", false, 2);
//        System.out.println(c1);
//        System.out.println(c1.radius);

        testPolymorphism();
    }

    public static void testPolymorphism(){
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("RED", false, 5.5);
        shapes[1] = new Square("BLUE", true, 10);
        shapes[2] = new Rectangle("YELLOW", true, 3, 5);
        shapes[3] = new Square("BROWN", false, 5);
        shapes[4] = new Circle("GREEN", true, 3);

        Random rand = new Random();
        for(int i = 0; i < 100; i++){
            int  i1 = rand.nextInt(4);
            int  i2 = rand.nextInt(4);

            Shape temp = shapes[i1];
            shapes[i1] = shapes[i2];
            shapes[i2]  = temp;
        }

        System.out.println();
        for(int i = 0; i < shapes.length; i++){
            Shape shape = shapes[i];

            System.out.println("Shape at index i : " + i );
            System.out.println(shape.toString());

            if(shape instanceof Circle){
                Circle c1 = (Circle) shape;
                System.out.println("This is a circle and I can reach the getRadius" + c1.getRadius());
            }

            System.out.println();
            System.out.println();
        }
    }



}
