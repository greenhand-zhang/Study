package com.greenhand.extendsStudy;

import java.lang.reflect.InvocationTargetException;

public class ClassStudy {

    public static void main(String[] args) {
        // get class
        String s = "abcd";
        Class c1 = s.getClass();
        try {
            Class c2 = Class.forName("className");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class c3 = String.class;
        c3 = int.class;
        try {
            c1.getConstructor().newInstance();
            c3.getConstructor().newInstance(); // throw NoSuchMethodException
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
