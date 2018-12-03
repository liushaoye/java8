package com.baidu.www.week.demo006;


import java.util.function.Function;

/**
 * <p>
 *     需求：
 *        （1）输入一个整数类型，返回一个字符串类型
 *        （2）例如：输入数字5，返回字符串"5"
 *
 *
 *
 * </p>
 */
public class Lambda006 {


    public static void main(String[] args) {
        Function<Integer,String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer);
            }
        };

        System.out.println("传统方式："+function.apply(100));

        Function<Integer,String> function1 = String::valueOf;

        System.out.println("Lambda方式："+function1.apply(101));


        //输入数字，获取5倍字符串

        Function<Integer,String> function2 = x->String.valueOf(5*x);

        System.out.println("Lambda的5倍方式："+function2.apply(100));


    }


}
