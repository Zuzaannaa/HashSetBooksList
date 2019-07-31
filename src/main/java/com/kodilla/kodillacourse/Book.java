package com.kodilla.kodillacourse;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;


class Book{
    private String title;
    private String author;
    int yearPublished;


    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    //override

    @Override
    public int hashCode(){
        return yearPublished;

    }

    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }

        if(o == null){
            return false;
        }

        if(getClass() != o.getClass()){
            return false;
        }

        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(yearPublished, book.yearPublished);
    }


    @Override
    public String toString(){
        return title + "," + author + "," + yearPublished;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }

    //override ends


}

class HashSetBook{
    public static void main(String[] args){

        HashSet<Book> library = new HashSet<Book>();
        library.add(new Book("Alias Grace", "Margaret Atwood", 1996));
        library.add(new Book("Cat's Eye", "Margaret Atwood", 1988));
        library.add(new Book("Oryx and Crake", "Margaret Atwood", 2003));
        library.add(new Book("The Year of the Flood", "Margaret Atwood", 2009));
        library.add(new Book("Hag Seed", "Margaret Atwood", 2016));


        for(Book books: library){
            if(books.getYearPublished() < 2010){
                System.out.println(books.getTitle());
            }

        }




    }



}