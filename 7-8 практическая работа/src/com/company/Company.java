package com.company;
import java.util.*;
public class Company {
    private double income=0;
    private ArrayList <Employee> employees = new ArrayList<Employee>();
    private
    Random r = new Random();

    public void hire(Employee man){
    employees.add(man);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeePosition().getJobTitle().compareTo(o2.getEmployeePosition().getJobTitle());
            }
        });
        //выглядит громозко, но я тут и дальше пытался контролировать зарплаты топ менеджеров при добавлении
        //или удалении сотрудников. Есть косяк с тем, что пересобирается доход каждый раз, из-за чего при тестах немного отличается каждый раз :-3
        income = 0;
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="Manager"){
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="TopManager"){
                i.setSalary(i.getSalary());
            }
        }
    }
    public void hireAll(ArrayList<Employee> employee){
    employees.addAll(employee);
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmployeePosition().getJobTitle().compareTo(o2.getEmployeePosition().getJobTitle());
        }
    });
        income = 0;
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="Manager"){
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        for (Employee i :employees){
            if (i.getEmployeePosition().getJobTitle()=="TopManager"){
                i.setSalary(i.getSalary());
            }
        }
    }
    public  void fire (int k) {
        employees.remove(k);
        income = 0;
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "Manager") {
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        if(income < 10000000){
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "TopManager"&& i.getSalary()>60000) {
                    i.setSalary(i.getSalary()/2.5);
        }
        }
    }
    }
    public void firex (int p){
        Random r =new Random();
        double k = employees.size() * ((double)p/100);
        System.out.println(k);
        for (int g = 0;g<(int)k;g++){
            employees.remove(r.nextInt(employees.size()));
        }
        income = 0;
        for (Employee i : employees) {
            if (i.getEmployeePosition().getJobTitle() == "Manager") {
                double t = i.getSalary();
                i.setSalary(t);
            }
        }
        if(income < 10000000){
            for (Employee i : employees) {
                if (i.getEmployeePosition().getJobTitle() == "TopManager"&& i.getSalary()>60000) {
                    i.setSalary(i.getSalary()/2.5);
                }
            }
        }
    }
    public double getlncome(){
        return income;
    }
    public void setIncome(double income) {
        this.income += income;
    }

    public void  getEmployees() {
        for (Employee i: employees) {
            System.out.println(i);
        }
    }
    public ArrayList<Employee> getTopSalaryStaff(int count){
        ArrayList <Employee> topsalary = new ArrayList<Employee>();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary()-o1.getSalary());
            }
        });
        for(int i = 0;i<count;i++){
            topsalary.add(employees.get(i));
        }
        return topsalary;
    }
    public ArrayList<Employee> getLowestSalaryStaff(int count){
        ArrayList <Employee> lowestsalary = new ArrayList<Employee>();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary()-o2.getSalary());
            }
        });
        for(int i = 0;i<count;i++){
            lowestsalary.add(employees.get(i));
        }
        return lowestsalary;
    }
public void getTopSalary(int count){
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o2.getSalary()-o1.getSalary());
        }
    });
    for(int i = 0;i<count;i++){
        System.out.println(employees.get(i).getSalary());
    }
}
public void getLowestSalary(int count){
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.getSalary()-o2.getSalary());
        }
    });
    for(int i = 0;i<count;i++){
        System.out.println(employees.get(i).getSalary());
    }
}
    //public void SetPosition
}