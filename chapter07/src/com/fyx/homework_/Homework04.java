package com.fyx.homework_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:02
 */
public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }

}
