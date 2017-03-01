package com.devcolibri.JavaGuruOopDz;

/**
 * Создайте класс Book, который должен описывать книгу.
 * У книги должны быть описаны следующие свойства:
 * автор, год выпуска, название и количество страний.
 * Для каждого из этих свойств должен быть создан метод
 * для его получения и задания нового значения (get and set methods).
 * Для демонстрации работы с классом Book создайте программу
 * в которой создайте по крайней мере 3 экземпляра класса Book
 * с разными свойствами.
 * <p>
 * Create class Book, describing a book including: release year, author, name, number of pages. For each of the properties there shall be getter and setter methods.
 * Write a main() method which demonstrates creating 3 Book objects with different property values, e.g.
 * Book cleanCode = new Book();
 * cleanCode.setTitle("Clean Code");
 * cleanCode.setAuthor("Robert Martin");
 */

public class Oop_DZ_2_Book {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setNumberPages(100);
        book1.setTitle("JavaGuru");
        book1.setAuthor("Jedi");
        book1.setReleaseYear(2017);
        book1.getinfo();

        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert Martin");
        cleanCode.setReleaseYear(1999);
        cleanCode.setNumberPages(900);
        cleanCode.getinfo();

        Book javaCode = new Book();
        javaCode.setTitle("Guru Code");
        javaCode.setAuthor("Vasily");
        javaCode.setReleaseYear(2018);
        javaCode.setNumberPages(2);
        javaCode.getinfo();
    }

}

class Book {
    private String author, title;
    private int realiseYear, numberPages;

    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setReleaseYear(int bookYear) {
        realiseYear = bookYear;
    }

    public void setNumberPages(int pagesInBook) {
        numberPages = pagesInBook;
    }

    public void getinfo() {
        System.out.println("Book Title is: " + title + ".(Number of pages is " + numberPages + ". Written by " +
                author + ". Release date is " + realiseYear + ")");
    }
}