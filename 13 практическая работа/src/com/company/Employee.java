package com.company;

public class Employee {
private int age;



    public void addAge(int age) throws ThrowException {
        if (age<0){
            throw new ThrowException();
        }
            this.age += age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }
}
