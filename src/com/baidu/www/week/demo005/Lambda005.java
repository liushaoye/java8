package com.baidu.www.week.demo005;

import java.util.Arrays;
import java.util.List;

public class Lambda005 {


    static String[] strings ={"test","hello","world","java","tom","c","JavaScript"};

    static Integer[] integers ={1,2,3,4,5};

    /**
     * 小写转大写
     * @param args
     */
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList(strings);


        if (!stringList.isEmpty()) {

            stringList.stream().map(String::toUpperCase).forEach(x-> System.out.println("lambda的map输出"+x));
        }

        System.out.println("*****************************");


        // 扩大二倍
        List<Integer> integerList = Arrays.asList(integers);


        if (!integerList.isEmpty()) {
            integerList.stream().map(x->x*2).forEach(x-> System.out.println("map转换2："+x));
        }

        System.out.println("*****************");

        // 求和

        if (!integerList.isEmpty()) {
           int num= integerList.stream().reduce((sum,x)->x+sum).get();

            System.out.println("求和"+num);
        }



    }
}
