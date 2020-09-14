package com.company.zadanie2;

public class Human {
    private String name;
    private int height;
    private double weight;
    Hand larm ;
    Leg lleg ;
    Hand rarm ;
    Leg rleg ;
    Head head ;

    public Human(String name, int height, double weight, int fingerr,int fingerl, int sizel,int sizer,String form) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.larm = new Hand(fingerl);
        this.lleg = new Leg(sizel);
        this.rarm = new Hand(fingerr);
        this.rleg = new Leg(sizer);
        this.head = new Head(form);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Hand getLarm() {
        return larm;
    }

    public void setLarm(int fingerl) {
        larm.setFingers(fingerl);
    }

    public Leg getLleg() {
        return lleg;
    }

    public void setLleg(int sizel) {
        lleg.setSize(sizel);
    }

    public Hand getRarm() {
        return rarm;
    }

    public void setRarm(int fingerr) {
        rarm.setFingers(fingerr);
    }

    public Leg getRleg() {
        return rleg;
    }

    public void setRleg(int sizer) {
        rleg.setSize(sizer);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(String form) {
        head.setForm(form);
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", larm=" + larm.getFingers() +
                ", lleg=" + lleg.getSize() +
                ", rarm=" + rarm.getFingers() +
                ", rleg=" + rleg.getSize() +
                ", head=" + head.getForm() +
                '}';
    }

    public class Hand {
        protected int fingers;
        public Hand(int fingers){
            this.fingers=fingers;
        }

        public int getFingers() {
            return fingers;
        }

        public void setFingers(int fingers) {
            this.fingers = fingers;
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
        protected    String form;
        public Head(String form){
            this.form = form;
        }

        public String getForm() {
            return form;
        }

        public void setForm(String form) {
            this.form = form;
        }

        public void intelligence() {
            System.out.println("Интеллект отсутствует");
        }
    }
    public class Leg {
        protected int size;
        public Leg (int size){
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
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
