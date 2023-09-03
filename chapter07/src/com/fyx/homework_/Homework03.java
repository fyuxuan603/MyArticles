package com.fyx.homework_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:00
 */
public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

}
