package com.fyx.homework.homework04;

public class Homework04 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(15);//灵活额修改带薪月份
        jack.printSal();

        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();

        Waiter waiter = new Waiter("mary",3000);
        waiter.printSal();

        //老师测试
        Teacher teacher = new Teacher("milan", 2000);
        //老师有课时费
        teacher.setClassDays(360);
        teacher.setClassSal(1000);
        teacher.printSal();

        //科学家
        Scientist scientist = new Scientist("tony", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();


    }
}
