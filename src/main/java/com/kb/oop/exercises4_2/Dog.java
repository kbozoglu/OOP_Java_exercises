package com.kb.oop.exercises4_2;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class Dog extends Animal {

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another){
        System.out.println("Woooooooof!");
    }
}
