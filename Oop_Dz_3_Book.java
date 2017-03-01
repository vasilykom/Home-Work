package com.devcolibri.JavaGuruOopDz;

/**
 * Добавьте в класс Book из Task 2 конструктор класса,
 * который устанавливал бы значения свойств класса в начальные значения.
 * Измените программу, которая демонстрирует работу с классом Book соответствующим образом.
 * <p>
 * Add to the Book class from Task 2 a constructor to set initial property values. Modify your main() method to
 * demonstrate using such constructor to create books, e.g.
 * Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
 * System.out.println("Power of Now title: " + powerOfNow.getTitle());
 * and so on...
 */

public class Oop_Dz_3_Book {
    public static void main(String[] args) {

        BookBook powerOfNow = new BookBook("Power of Now", "Eckhart Tolle", 2001, 224);
        powerOfNow.getinfo();
        System.out.println("Power of Now title: " + powerOfNow.getTitle());
        System.out.println("Power of Now Author: " + powerOfNow.getAuthor());
        System.out.println("Power of Now Release Year: " + powerOfNow.getRealiseYear());
        System.out.println("Power of Now number of pages: " + powerOfNow.getNumberOfPages());
    }
}
class BookBook {
    private String author, title;
    private int realiseYear, numberOfPages;

    public BookBook(String bookTitle, String bookAuthor, int bookYear, int bookPages ){
        author=bookAuthor;
        title=bookTitle;
        realiseYear=bookYear;
        numberOfPages =bookPages;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getRealiseYear(){
        return realiseYear;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setAuthor(String userAuthor) {
        author = userAuthor;
    }

    public void setTitle(String userTitle) {
        title = userTitle;
    }

    public void setReleaseYear(int userYear) {
        realiseYear = userYear;
    }

    public void setNumberOfPages(int userBookPages) {
        numberOfPages = userBookPages;
    }

    public void getinfo() {
        System.out.println("Book Title is: " + title + ".(Number of pages is " + numberOfPages + ". Written by " + author + ". Release date is " + realiseYear + ")");
    }
}