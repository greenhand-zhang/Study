package com.greenhand.extendsStudy;

import com.greenhand.classstudy.Employee;

import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.ArrayList;

public class ExtendTest {

    public static void main(String[] args) {
        Employee employee = new Manager("zhanglinlin", 10000, 2018, 7, 9);
        Employee employee1 = new Employee("zhanglinlin", 10000, 2018, 7, 9);

        employee.getSalary();
        Manager manager = null;
        if (employee instanceof Manager){
             manager = (Manager)employee;
        }
        manager.setBonus(10000);

        System.out.println(employee.getClass());
        System.out.println(employee1.getClass());
        java.lang.Object object = employee;
        System.out.println(object.equals(employee));

        System.out.println(employee.hashCode());
        System.out.println(object.hashCode());
        System.out.println(employee1.hashCode());

        ArrayList<Employee> arrayList = new ArrayList<Employee>();

//        Person person = new Person("zhangll"); can not construct
    }
}
