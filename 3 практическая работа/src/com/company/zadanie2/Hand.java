package com.company.zadanie2;

public class Hand {
    private int fingers;
public Hand(int fingers){
    this.fingers=fingers;
}
public void status (){
    if (fingers == 5){
        System.out.println("Нормальная рука");
    }
    else {
        System.out.println("А кому нужны пальцы?");
    }
    }
}
