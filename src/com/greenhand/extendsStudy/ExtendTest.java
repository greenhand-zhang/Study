package com.greenhand.extendsStudy;

import com.greenhand.classstudy.Employee;

public class ExtendTest {

    public static void main(String[] args) {
        Employee employee = new Manager("zhanglinlin", 10000, 2018, 7, 9);
        employee.getSalary();
        Manager manager = null;
        if (employee instanceof Manager){
             manager = (Manager)employee;
        }
        manager.setBonus(10000);

//        Person person = new Person("zhangll"); can not construct
    }
}
