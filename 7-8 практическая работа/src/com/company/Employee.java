package com.company;

public class Employee  {
   private String SecondName,Name;
   private EmployeePosition employeePosition;
   private double salary;

   public Employee(String secondName, String name, EmployeePosition employeePosition, double salary) {
      SecondName = secondName;
      Name = name;
      this.employeePosition = employeePosition;
      this.salary = employeePosition.calcSalary(salary);
   }

   public String getSecondName() {
      return SecondName;
   }

   public void setSecondName(String secondName) {
      SecondName = secondName;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public EmployeePosition getEmployeePosition() {
      return employeePosition;
   }

   public void setEmployeePosition(EmployeePosition employeePosition) {
      this.employeePosition = employeePosition;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      employeePosition.calcSalary(salary);

   }

   @Override
   public String toString() {
      return "Employee{" +
              "SecondName='" + SecondName + '\'' +
              ", Name='" + Name + '\'' +
              ", job=" + employeePosition.getJobTitle() +
              ", salary=" + salary +
              '}';
   }
}