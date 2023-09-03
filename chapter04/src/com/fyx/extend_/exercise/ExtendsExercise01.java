package com.fyx.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b=new B();//a , b name, b
    }
}

//class A {
//    A() {
//        System.out.println("a");
//    }
//
//    A(String name) {
//        System.out.println("a name");
//    }
//}
//
//class B extends A {
//    B() {
//        this("abc");//调用同类的传入字符串的构造器，因此调用了下面的有参构造器
//        System.out.println("b");
//    }
//
//    B(String name) {
//        //默认有 super();去调用A的无参构造器
//        System.out.println("b name");
//    }
//}
