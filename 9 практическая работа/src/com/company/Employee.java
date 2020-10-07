package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private String Name;
    private String Secondname;
    private LocalDate dob ;
    private String location;
    private long number;
    private int salary;
    Random r = new Random();

    public Employee(String name, String secondname, String location, long number, int salary) {
        Name = name;
        Secondname = secondname;
        this.dob = LocalDate.of(r.nextInt(20)+1980,r.nextInt(11)+1,
                r.nextInt(27)+1);
        this.location = location;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Secondname='" + Secondname + '\'' +
                ", dob=" + dob +
                ", location='" + location + '\'' +
                ", number=" + number +
                ", salary=" + salary +
                '}';
    }
}
