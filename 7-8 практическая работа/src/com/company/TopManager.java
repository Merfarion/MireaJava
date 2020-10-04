package com.company;

import java.util.Random;

public class TopManager implements EmployeePosition {
Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double base) {
        if(company.getlncome()>10000000){
            return base*2.5;
        }
        else {
            return base;
        }
    }
}
