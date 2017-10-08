package com.kodilla;

import java.util.*;
import java.lang.*;

/**
 * Created by Bartosz Biernacki.
 */
public class Books {

    String bookTitle;
    String bookAuthor;
    Integer publicationDate;


    public Books(String bookTitle, String bookAuthor, int publicationDate) {

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publicationDate = publicationDate;
    }

    public int hashCode() {
        return publicationDate();
    }

    private int publicationDate() {
        return 0;
    }

    public boolean equals(Object o) {
        Books b = (Books) o;
        return (bookTitle.equals(b.getBookTitle())) &&
                (bookAuthor.equals(b.getBookAuthor())) &&
                (publicationDate.equals(b.getYear()));

    }

    public java.lang.String toString() {
        return  "Książka pod tytułem" +  bookTitle  + "autor" + bookAuthor + ", wydana w roku: " + publicationDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Integer getYear() {
        return publicationDate;
    }

}

class HashSetExample {

    public static void main(String[] args) throws java.lang.Exception {
        Books book1 = new Books(" \"Inferno\" ", " Dan Brown ", 2013);
        Books book2 = new Books(" \"Mały książe\" ", " Antoine de Saint-Exupéry ", 1943);
        Books book3 = new Books(" \"Kuchnia Polska\" ", " Andrzej Frukacz", 2003);
        Books book4 = new Books(" \"Człowiek wśród ludzi\" ", " Bogdan Wojciszke", 2002);
        Books book5 = new Books(" \"Wywieranie wpływu na ludzi\" ", " Robert B. Caldini", 2004);
        Books book6 = new Books(" \"Kamienie na szaniec\" ", " Aleksander Kamiński ", 1943);
        Books book7 = new Books(" \"Wszyscy mamy tajemnice\" ", " Harlan Coben ", 2012);
        Books book8 = new Books(" \"Ono\" ", "Dorota Terakowska ", 2003);
        Books book9 = new Books(" \"Psychoza\" ", " Robert Bloch ", 2008);
        Books book10 = new Books(" \"Ptasiek\" ", " William Wharton ", 2008);
        Books book11 = new Books(" \"O obrotach ciał niebieskich\" ", " Mikołaj Kopernik ", 1543);

        HashSet<Books> bookSet = new HashSet<Books>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        bookSet.add(book7);
        bookSet.add(book8);
        bookSet.add(book9);
        bookSet.add(book10);
        bookSet.add(book11);

        for (Books theBook : bookSet) {
            if (theBook.getYear() < 2010) {
                System.out.println(theBook);


            }
        }

    }
}