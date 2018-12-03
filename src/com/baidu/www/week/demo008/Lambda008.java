package com.baidu.www.week.demo008;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda008 {


    public static void main(String[] args) {



        String[] s = {"A1", "B2", "C3", "D4"};


        List<String> stringList = Arrays.asList(s);


        // predicate用法
        if (!stringList.isEmpty()) {

            stringList.stream().filter(new Predicate<String>() {
                @Override
                public boolean test(String s) {
                    return !s.equals("C3");
                }
            }).forEach(System.out::println);
        }

        System.out.println("*****************************");
        if (!stringList.isEmpty()) {
            stringList.stream().filter(x->!x.equals("C3")).forEach(System.out::println);
        }

    }
}
