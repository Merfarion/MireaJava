package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Company company = new Company();
    int k=0,n=1,salary,job;
        String name,secondname;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = new String[]{"gleb","artem","sasha","masha","egor","vasilisa","misha","grisha","jack","robert","fedya","tom","sam","tolya","kolya","petya","polina"};
        String[] secondnames = new String[] {"gonets","socrat","pifagor","ivanov","blue","ford","uran","silver","kent","dragon","firefly","shepard","vakarian","trump","white","black"};
        Scanner in = new Scanner(System.in);
        Random r = new Random();
while (n!=0) {
    System.out.println("Выберите способ добавления сотрудников" + "\n" + "0:закончить ввод; 1:одного сотрудника; 2:список сотрудников");
    n = in.nextInt();
    switch (n) {

        case 1: {

            name = bufferedReader.readLine();
            secondname =bufferedReader.readLine() ;

            System.out.println("1:operator 2:manager 3:topmanager");
            job= in.nextInt();
            switch (job) {
                case 1: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new Operator(company), salary);
                    company.hire(e);
                }
                break;
                case 2: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new Manager(company), salary);
                    company.hire(e);
                }
                break;
                case 3: {
                    salary = in.nextInt();
                    Employee e = new Employee(secondname, name, new TopManager(company), salary);
                    company.hire(e);
                }
                break;
            }
        }
        break;
        case 2: {
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new Operator(company), (r.nextInt(20000) + 20000)));
            }
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new Manager(company), (r.nextInt(20000) + 30000)));
            }
            k = in.nextInt();

            for (int i = 0; i < k; i++) {
                employees.add(new Employee(secondnames[r.nextInt(secondnames.length)], names[r.nextInt(names.length)], new TopManager(company), (r.nextInt(20000) + 40000)));
            }
            company.hireAll(employees);
            company.hireAll(employees);
            company.hireAll(employees);
        }
        break;
    }
}
       company.getEmployees();
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(company.getLowestSalaryStaff(20));
        System.out.println();
        System.out.println(company.getlncome());
        int p =0;
        System.out.println("Сколько процентов сотрудников надо удалить?");
        p= in.nextInt();
        company.firex(p);
        System.out.println();
        System.out.println(company.getlncome());
        company.getEmployees();
        System.out.println();
        company.getTopSalary(10);
        System.out.println();
        company.getLowestSalary(20);
	// write your code here

    }
}
