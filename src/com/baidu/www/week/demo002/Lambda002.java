package com.baidu.www.week.demo002;


/**
 * <p>
 *   需求：
 *      任意2个数的计算
 *
 *   案例：
 *      例1；
 *          方法add（1，2）=1+2=3
 *      例2：
 *          方法mult（1，2）=1*2=2
 *
 * </p>
 *
 *
 */

public class Lambda002 {


    public static void main(String[] args) {
        Count001 count001 = new Count001() {
            @Override
            public Integer add(int x, int y) {
                return x+y;
            }

            @Override
            public Integer mult(int x, int y) {
                return x*y;
            }
        };

        System.out.println("老版写法加法 ："+count001.add(1,2));

        System.out.println("老版写法乘法 ："+count001.mult(5,6));


        LambdaDemo lambdaDemo1 = (x, y) -> x+y;
        LambdaDemo lambdaDemo2 = (x, y) -> x*y;

        System.out.println("lambda加法 ："+lambdaDemo1.count(1,2));
        System.out.println("lambda乘法 ："+lambdaDemo2.count(5,6));

    }



}
