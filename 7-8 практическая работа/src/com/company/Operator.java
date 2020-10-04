package com.company;
public class Operator implements EmployeePosition {
Company company;
    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double base) {
        return base;
    }
}
