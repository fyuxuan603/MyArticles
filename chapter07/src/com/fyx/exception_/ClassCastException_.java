package com.fyx.exception_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:13
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B)b;//向下转型，这里是OK
        C c2 = (C)b;//这里抛出ClassCastException
    }
}
class A {}
class B extends A {}
class C extends A {}

