package com.baidu.www.week.demo001;

public class Lambda001 {


    /**
     * 匿名内部类写法
     */
    static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable 001 ******");
        }
    };


    /**
     * Lambda表达式写法
     */
     static Runnable runnable2 = ()->{
        System.out.println("runnable 002 ******");
    };


    public static void main(String[] args) {

        // run1和run2是等价的

        runnable1.run();
        runnable2.run();

    }

}
