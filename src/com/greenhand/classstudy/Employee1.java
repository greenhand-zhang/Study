package com.greenhand.classstudy;

import java.time.LocalDate;
import java.util.Date;

public class Employee1 {

    private String name;
    private double salary;
    private Date hireday;

    public Employee1(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireday = new Date(year, month, day);
    }

    public Date getHireday() {
        return hireday;
    }

    public Date getHiredayClone(){
        return (Date) hireday.clone();
    }

}
