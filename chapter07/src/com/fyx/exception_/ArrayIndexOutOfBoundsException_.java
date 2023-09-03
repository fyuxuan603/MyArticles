package com.fyx.exception_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:12
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

