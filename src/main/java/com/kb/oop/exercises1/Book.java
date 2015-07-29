package com.kb.oop.exercises1;

/**
 * Created by kbozoglu on 20.07.2015.
 */
public class Book {

    private String name;
    private Author[] authors = new Author[5];
    private int numAuthors = 0;

    private double price;
    private int qtyInStock = 0;

    public Book(String name, double price, int qtyInStock){
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public void addAuthor(Author author){
        authors[numAuthors] = author;
        ++numAuthors;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString(){
        return name + " by " + authors.length + " authors";
    }

    public void printAuthors(){
        for(int i = 0; i < authors.length; ++i){
            System.out.println(authors[i]);
        }
    }

    //TODO: public boolean removeAuthorByName(String authorName)
//    public String getAuthorName(){
//        return this.getAuthor().getName();
//    }
//
//    public String getAuthorEmail(){
//        return this.getAuthor().getEmail();
//    }
//
//    public char getAuthorGender(){
//        return this.getAuthor().getGender();
//    }
}
