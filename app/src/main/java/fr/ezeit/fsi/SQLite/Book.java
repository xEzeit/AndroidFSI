package fr.ezeit.fsi.SQLite;

import java.sql.Date;

public class Book {
    private String BookId;
    private String Title;
    private String Masse;
    private Date Jour;


    public Book(String bookId, String title, String masse, Date jour) {
        BookId = bookId;
        Title = title;
        this.Masse = masse;
        Jour = jour;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMasse() {
        return Masse;
    }

    public void setMasse(String masse) {
        this.Masse = masse;
    }

    public Date getJour() {
        return Jour;
    }

    public void setJour(Date jour) {
        Jour = jour;
    }
}

