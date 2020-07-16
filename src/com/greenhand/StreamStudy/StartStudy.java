package com.greenhand.StreamStudy;

import java.util.LinkedList;
import java.util.List;

public class StartStudy {

    public void forEach(){
        List<String> list = new LinkedList<>();

        list.add("zhangliniln");
        list.add("zhang");
        list.add("lin");
        list.add("lin");
        list.add("l");
        list.add("o");
        list.add("j");
        list.add("k");
        list.add(",");


        System.out.println(list.stream()
                .filter(s -> s.length() > 5)
                .count());

        System.out.println(list.parallelStream().filter(s -> s.length() > 5).count());

    }

    public static void main(String[] args) {
        StartStudy startStudy = new StartStudy();
        startStudy.forEach();
    }

}
