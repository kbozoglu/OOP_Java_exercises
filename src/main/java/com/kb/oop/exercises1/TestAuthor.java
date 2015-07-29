package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class TestAuthor {

    public static void main(String[] args){
        Author a1 = new Author("Orhan Pamuk", "opamuk@gmail.com", 'M');
        Author a2 = new Author("Ayse Kulin", "akulin@yahoo.com", 'F');

        System.out.println("Before:");
        System.out.println(a1.toString());
        System.out.println(a2);

        System.out.println("\n" + "After:");
        a1.setEmail(a2.getEmail());
        System.out.println(a1);


    }

}
