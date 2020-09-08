package com.company.zadanie2;

public class Leg {
    private int size;
   public Leg (int size){
        this.size = size;
    }
    public void comment(){
       if(size <39) {
           System.out.println("Ножка Золушки");
       }
       else
           if(size<43){

               System.out.println("Нормальный размер ноги");
           }
           else{
               System.out.println("Лыжи");
           }
    }
}
