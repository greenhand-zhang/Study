package com.greenhand.classstudy;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("zhang", 10000L, 2019, 7, 9);
        employee.raiseSalary(50);
        System.out.println(employee.getSalary());
    }
}
