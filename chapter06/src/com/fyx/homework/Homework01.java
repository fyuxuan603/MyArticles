package com.fyx.homework;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-22:07
 */
public class Homework01 {
    public static void main(String[] args) {
        Car c =new Car();
        Car c1=new Car(100);
        System.out.println(c);//9.0,red
        System.out.println(c1);//100.0,red

    }
}
class Car{
    double price=10;
    static String color="white";//静态属性只在类被创建时执行一次
    public String toString(){
        return price+"\t"+color;
    }
    public Car(){
        this.price=9;
        this.color="red";
    }
    public Car(double price){
        this.price=price;
    }
}
