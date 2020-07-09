package com.greenhand.classstudy;

import java.time.LocalDate;
import java.util.Objects;

//public final class Employee :: can not extend
public class Employee {

    private String name;
    private double salary;
    protected LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = Objects.requireNonNull(name);
        this.salary = salary;
        this.hireday = LocalDate.of(year, month, day);
    }

    //can not extend
    public final String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }

    public void raiseSalary(double percent){
        salary += salary / percent * 100;

    }
}
