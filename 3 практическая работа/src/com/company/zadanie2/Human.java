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
}
