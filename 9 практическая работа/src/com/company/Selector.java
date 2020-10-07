package com.company;

public class Selector implements EmployeeSelector {
    private  int salary1;
    private  int salary2;

    public Selector(int salary1, int salary2) {
        this.salary1 = salary1;
        this.salary2 = salary2;
    }


    @Override
    public boolean isneeed(Employee employee) {
        return employee.getSalary()<salary1&&employee.getSalary()>salary2;
    }
}
