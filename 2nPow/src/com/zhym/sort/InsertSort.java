package com.zhym.sort;

/**
 * @description:
 * @author: zhym
 * @time: 2021/1/23 0023 20:15
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 9, 11, 3, 55, 7, 22};

        for (int i = 1; i < arr.length; i ++) {
            int data = arr[i];
            int j = i - 1;
            for (;j >= 0; j--) {
                if (arr[j] < data) {
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j + 1] = data;
        }

        for ( int i:arr) {
            System.out.print(i + " ");
        }
    }

}
