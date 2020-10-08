package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.time.*;
public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"gleb","artem","sasha","masha","egor","vasilisa","misha","grisha","jack","robert","fedya","tom","sam","tolya","kolya","petya","polina"};
        String[] secondnames = new String[] {"gonets","socrat","pifagor","ivanov","blue","ford","uran","silver","kent","dragon","firefly","shepard","vakarian","trump","white","black"};
        Scanner in = new Scanner(System.in);
        Random r = new Random();
    Company company = new Company();
    for (int i = 0;i<25;i++){
        company.addemplyee(new Employee(names[r.nextInt(names.length)],
                secondnames[r.nextInt(secondnames.length)],"Moscow",r.nextInt(999_999_999)+990000000,
                r.nextInt(10000)+28000));
    }
        System.out.println(company.toString());
    company.removeemployee(5);
    company.DoSmthWithEmpl(new Selector(36000,32000),
            ((employee, count) -> System.out.println("employee"+count+":"+employee)));
    String k = "masha";
    company.DoSmthWithEmpl(new EmployeeSelector() {
                               @Override
                               public boolean isneeed(Employee employee) {
                                   return employee.getName() == k;
                               }

                           },
            new EmployeesHandle() {
                @Override
                public void HandleEmployees(Employee employee, int count) {
                    System.out.println("=="+count + "==");
                    System.out.println(employee);
                }
            }
    );
        ArrayList<Employee> selemployees = new ArrayList<>();
    company.DoSmthWithEmpl(
            employee-> employee.getName()==k,
            (employee, count) -> selemployees.add(employee));
    EmployeeSelector selector = employee -> employee.getSalary()>33000;
    company.DoSmthWithEmpl(
            selector,
            new EmployeesHandle() {
                @Override
                public void HandleEmployees(Employee employee, int count) {
                    System.out.println("=="+count + "==");
                    System.out.println(employee);
                }
            }
    );
	// write your code here
    }

}
