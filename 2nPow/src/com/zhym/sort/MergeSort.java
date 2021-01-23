package com.zhym.sort;

/**
 * @description: 归并排序
 * @author: zhym
 * @time: 2021/1/23 0023 21:36
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 3, 5, 1, 9, 0, 7, 11};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] +" ");
        }
    }

    private static void sort(int[] arr, int left, int right) {

        if (left < right) {
            //分
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            //并
            merge(arr, left, mid, right);
        }

    }

    private static void merge(int[] arr, int left, int mid , int right) {
        int[] temp = new int[arr.length];
        int point1 = left;
        int point2 = mid +1;
        int loc = left;

        while (point1 <= mid && point2 <= right) {
            if (arr[point1] < arr[point2]) {
                temp[loc] = arr[point1];
                point1 ++;
            }else {
                temp[loc] = arr[point2];
                point2 ++;
            }
            loc ++;
        }

        while (point1 <= mid) {
            temp[loc++] = arr[point1];
            point1 ++;
        }
        while (point2 <= right) {
            temp[loc++] = arr[point2];
            point2 ++;
        }

        for (int i = left; i <= right; i ++) {
            arr[i] = temp[i];
        }

    }

}




