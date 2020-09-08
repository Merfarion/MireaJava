package com.company.zadanie3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    Book book = new Book("Война и мир","Толстой",1905,777);
    System.out.println("Название книги: "+ book.getName()+"\nАвтор: "+book.getAuthor()+"\nКоличество страниц: "+book.getKolvostr()+"\nГод выпуска: "+book.getGod());
    book.setAuthor("Гоголев");
    book.setGod(1813);
    System.out.println("Название книги: "+ book.getName()+"\nАвтор: "+book.getAuthor()+"\nКоличество страниц: "+book.getKolvostr()+"\nГод выпуска: "+book.getGod());
    }
}
