package com.company.zadanie2;

public class Human {
    private String name;
    private int height;
    private double weight;
    Hand arm = new Hand(5);
    Leg leg = new Leg(42);
    Head head = new Head("round");
    public Human ( String name,int height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", arm=" + arm +
                ", leg=" + leg +
                ", head=" + head +
                '}';
    }
    public void vyvod(){
        arm.status();
        leg.comment();
        head.intelligence();
    }
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
    public class Head {
        private   String form;
        public Head(String form){
            this.form = form;
        }
        public void intelligence() {
            System.out.println("Интеллект отсутствует");
        }
    }
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
}
