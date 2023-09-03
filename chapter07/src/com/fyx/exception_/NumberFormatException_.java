package com.fyx.exception_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:12
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "fyx";
        //将String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}
