package com.zhym.array;

import java.io.*;

/**
 * @description:
 * @author: zhym
 * @time: 2021/1/16 0016 22:59
 */
public class AgeStat {

    public static void main(String[] args) {

        String fileName = "E:/ab.txt";
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
            BufferedReader br = new BufferedReader(reader)) {

            int[] data = new int[200];
            String str = "";
            int total = 0; //int - 21亿


            while ((str = br.readLine()) != null) {
                int age = Integer.valueOf(str);
                data[age] ++;
                total ++;
            }
            System.out.println("数据大小：" + total);
            for (int i = 0; i < 200; i ++) {
                System.out.println(i + " : " + data[i]);
            }

            /**
             * 整个时间复杂度为O(n)
             *  第一个循环为O(n),第二个循环为O(200) -- 所以为O(n)
             */

            //估算计算机执行 一般最差计算机cup处理为100万/s ,按照现在计算机性能一般都有1000万/s

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
