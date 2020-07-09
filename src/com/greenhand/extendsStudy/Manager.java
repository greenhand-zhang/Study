package com.greenhand.extendsStudy;

import com.greenhand.classstudy.Employee;

import java.time.LocalDate;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public LocalDate getHireday() {
        return super.getHireday();
//        return hireday;   can use
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

}
