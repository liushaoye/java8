package com.baidu.www.week.demo004;

import java.util.Arrays;
import java.util.List;

public class Lambda004 {

   static Integer[] nums = {1,2,3,4,null,5,null,6};

    /**
     *
     * <p>
     *     计算整形容器，所有元素之和
     *
     *
     * </p>
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(nums);

        int sum = 0;

        if (!integerList.isEmpty()) {

            for (Integer integer : integerList) {
                if (integer==null) {
                    continue;
                }

                sum+=integer;

            }

            System.out.println("数组相加的结果："+sum);


            sum= integerList.stream().filter(x->x!=null).reduce((s,x)->s+x).get();

            System.out.println("lambda相加的结果："+sum);
        }













    }
}
