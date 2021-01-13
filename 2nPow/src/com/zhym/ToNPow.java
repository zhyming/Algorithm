package com.zhym;

/**
 * @description: 判断一个数是否是2的N次方
 * @author: zhym
 * @time: 2021/1/13 0013 20:08
 */
public class ToNPow {

    public static void main(String[] args) {

        //System.out.println(is2nPow(1024));
        System.out.println(is2nPow2(1000));
    }

    /**
     * 循环计算
     * @param digit
     * @return
     */
    private static boolean is2nPow(int digit) {
        boolean result = false;

        while (digit > 1) {
            if (digit % 2 != 0) {
                result = false;
                break;
            }
            if (!result) {
                result = true;
            }
            digit = digit / 2;
        }
        return result;
    }

    /**
     * 位运算
     * @param digit
     * @return
     */
    private static boolean is2nPow2(int digit) {
        if ((digit & (digit -1)) == 0) {
            return true;
        }
        return false;
    }
}
