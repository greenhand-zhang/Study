package com.greenhand.classstudy;

import java.util.Date;
import java.util.Objects;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("zhang", 10000L, 2019, 7, 9);
        employee.raiseSalary(50);
        System.out.println(employee.getSalary());
        Employee1 employee1 = new Employee1("zhang", 10000L, 2019, 7, 9);

        //employee1 中hireDay被改变
        Date date = employee1.getHireday();
        date.setTime(0L);
//        employee1 中hireDayb不会被改变
        Date newDate = employee1.getHiredayClone();
        newDate.setTime(10L);
        System.out.println();
    }
}
