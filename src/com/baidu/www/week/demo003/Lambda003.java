package com.baidu.www.week.demo003;

import java.util.Arrays;
import java.util.List;

/**
 * 容器遍历
 *
 */
public class Lambda003 {

    public static void main(String[] args) {


        String[] s = {"cat001","cat002","cat003"};

        // 字符串数组转List数组
        List<String> stringList = Arrays.asList(s);


        System.out.println("传统for增强循环遍历，属于客户端的循环");
        if (!stringList.isEmpty()) {
            for (String s1 : stringList) {
                System.out.println(s1);
            }
        }


        System.out.println("lambda循环，属于JDK内部循环 ");

        if (!stringList.isEmpty()) {
            stringList.forEach(s1 -> System.out.println(s1));
        }



    }
}
