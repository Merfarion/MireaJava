package com.company.zadanie3;

public class Book {
    //автор, название, год написания и т. д.
   private String name, author;
    private int god,kolvostr;
    public Book (){}
   public Book(String name, String author, int god,int kolvostr){
        this.name =name;
        this.author = author;
        this.god = god;
        this.kolvostr = kolvostr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public int getKolvostr() {
        return kolvostr;
    }

    public void setKolvostr(int kolvostr) {
        this.kolvostr = kolvostr;
    }
}
