package com.company;

import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Scanner in = new Scanner(System.in);


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Age() {
        System.out.println("Возраст данной собаки равен " + age * 7 + "человеческих лет");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
