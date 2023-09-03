package com.fyx.homework;

public class Homework03 {
    public static void main(String[] args) {
        Manager manage = new Manager("刘备", 500, 20, 1.2);
        //设置奖金
        manage.setBonus(1000);
        //打印经理的工资情况
        manage.printSal();

        Worker worker = new Worker("关羽",100, 10, 1.0);
        //打印员工的工资情况
        worker.printSal();
    }
}
