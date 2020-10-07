package com.company;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }
    public void addemplyee(Employee employee){
        employees.add(employee);
    }
    public void removeemployee(int index){
        employees.remove(index);
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void DoSmthWithEmpl(EmployeeSelector selector,EmployeesHandle handler){
        int count = 0;
        for (Employee employee: employees){
            if(selector.isneeed(employee)){
                handler.HandleEmployees(employee,count);
                count++;
            }
        }
        System.out.println(count);
    }
    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}
