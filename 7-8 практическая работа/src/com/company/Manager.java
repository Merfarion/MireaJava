package com.company;

import java.util.Random;

public class Manager implements EmployeePosition {
    private int a=115000,b=140000;
    private int diff = b-a;
    Random r = new Random();
    Company company;

    public Manager(Company company) {
        this.company = company;
        //company.setIncome(company.getlncome()+(r.nextInt(diff+1)+a));
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double base) {
        int t;
        t=(r.nextInt(diff+1)+a);
        company.setIncome(t);
        return t*0.05 + base;
    }
}
