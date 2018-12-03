package com.baidu.www.week.demo007;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * consumer 实际的实现方式
 */
public class Lambda007 {


    public static void main(String[] args) {


        String[] s = {"A1", "B2", "C3", "D4"};


        List<String> stringList = Arrays.asList(s);



        // cosumer用法
        if (!stringList.isEmpty()) {

            stringList.forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    System.out.println(s);
                }
            });

        }


        System.out.println("************");

        // lambda 实现方式

        if (!stringList.isEmpty()) {
            stringList.forEach(System.out::println);
        }














    }
}
