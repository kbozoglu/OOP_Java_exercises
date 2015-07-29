package com.kb.oop.exercises4_2;

/**
 * Created by kbozoglu on 26.07.2015.
 */
public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
