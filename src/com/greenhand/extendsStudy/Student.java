package com.greenhand.extendsStudy;

public class Student extends Person {


    public Student(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "my name is zll";
    }
}
