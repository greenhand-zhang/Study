package com.greenhand.extendsStudy;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;

public class ClassStudy {

    public static void resource(){
        Class cl = ClassStudy.class;
        URL url0 = cl.getResource("/com/greenhand/2.jpg");
        URL url1 = cl.getResource("1.jpg");
        URL url2 = cl.getResource("data/3.jpg");
        InputStream resourceAsStream = cl.getResourceAsStream("data/my.txt");
        byte[] bytes = new byte[1024];
        try {
            resourceAsStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = new String(bytes).trim();


        ImageIcon imageIcon = new ImageIcon(url2);
    }

    public static void classTest(String[] args) {
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

    public static void main(String[] args) {
//        resource();
        Reflection.printStart(String.class);
        Reflection.printFields(String.class);
        Reflection.printConstructors(String.class);
        Reflection.printMethods(String.class);
        Reflection.printEnd();
    }


}

class Reflection{

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();

        Arrays.stream(constructors).forEach(constructor -> {
            String name = constructor.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            Arrays.stream(constructor.getParameterTypes()).forEach(aClass -> {
                System.out.print(aClass.getName());
                System.out.print(", ");
            });

            System.out.println(");");
        });
        System.out.println();
    }

    public static void printMethods(Class cl){
        Arrays.stream(cl.getDeclaredMethods()).forEach(method -> {

            System.out.print("  ");
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");

            }
            System.out.print(method.getReturnType().getName() + " ");
            System.out.print(method.getName() + "(");

            Arrays.stream(method.getTypeParameters()).forEach(typeVariable -> {
                System.out.print(typeVariable.getName());
                System.out.print(", ");
            });

            System.out.println(");");
        });
        System.out.println();
    }

    public static void printFields(Class cl){
        Arrays.stream(cl.getDeclaredFields()).forEach(field -> {
            System.out.print("  ");
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0){
                System.out.print(modifiers + " ");
            }
            System.out.println(field.getType().getName() + " " + field.getName() + ";");

        });
        System.out.println();
    }

    public static void printStart(Class cl){
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0){
            System.out.print(modifiers + " ");
        }
        System.out.print("class " + cl.getName());

        Class superclass = cl.getSuperclass();
        if (superclass != null && superclass != java.lang.Object.class){
            System.out.print(" extends " + superclass.getName());
        }
        System.out.println("{");
        System.out.println();

    }

    public static void printEnd(){
        System.out.println("}");
    }

}