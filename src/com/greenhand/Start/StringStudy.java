package com.greenhand.Start;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringStudy {

    public static void main(String[] args) throws FileNotFoundException {
        String s = String.join(".","www","baidu","com", "人");
        System.out.println(s);
        "".equals(s);
        "".compareTo(s);
        int length = s.length();
        int cpCount = s.codePointCount(0, s.length());
        char first = s.charAt(0);
        char c = s.charAt(2);
        String a = "\u0019\u0020abdsa";
        int [] code = s.codePoints().toArray();
        a = a.trim();
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("HI");
//        scanner.nextLine();
//        System.out.println("1");
//        scanner.next();
        Scanner scanner = new Scanner(new File("K:\\Code\\Java_study\\a123"));


        System.out.println();
    }
}
