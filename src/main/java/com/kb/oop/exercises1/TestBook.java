package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class TestBook {

    public static void main(String[] args){

//        Author a1 = new Author("Stephen King", "sking@yahoo.com", 'M');
//        Book b1 = new Book("Rose House", a1, 19.95, 560);
//        Book b2 = new Book("Sefiller", new Author("Victor Hugo", "vhugo@yahoo.com", 'M'), 14.95, 80);
//
//        System.out.println(b1.getAuthor().getName() + " " + b1.getAuthor().getEmail());
//        System.out.println(b2.getAuthorName() + " " + b2.getAuthorEmail());
//
//        Author[] authors = new Author[2];
//        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
//        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

//        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
//        System.out.println(javaDummy);  // toString()
//        System.out.print("The authors are: ");
//        javaDummy.printAuthors();
        Book javaDummy = new Book("Java for Dummy", 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();

        javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
        javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();



    }

}
