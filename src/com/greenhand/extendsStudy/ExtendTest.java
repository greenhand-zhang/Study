package com.greenhand.extendsStudy;

import com.greenhand.classstudy.Employee;
import org.omg.CORBA.IntHolder;

import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.ArrayList;

public class ExtendTest {

    public static void test(IntHolder a){
        a.value = a.value + 3;
    }

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

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2); // intergers.add(Integer.valueof(2)); 自动装箱
        int n = integers.get(0); // intergers.get(i).intValue(); 自动拆箱

        Integer a = 1; // 自动装箱
        Integer b = 1; // 自动装箱
        Integer d = a + b; // 自动拆箱a b计算 得到的值装箱到d
        System.out.println(a == b); // true 由于java会int将 -128到127区间的值放到同一对象中

        a = 1000;
        b = 1000;
        System.out.println(a == b); //false

        Integer c = 2;
        System.out.println(2 * c); //自动拆箱

//        Person person = new Person("zhangll"); can not construct
    }
}
