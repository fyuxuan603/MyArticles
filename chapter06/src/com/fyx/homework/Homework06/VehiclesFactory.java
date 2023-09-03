package com.fyx.homework.Homework06;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-22:45
 */
public class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse horse = new Horse(); //饿汉式

    private VehiclesFactory(){}
    //创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    //这里，我们将方法做成static
    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }
    public static Boot getBoot() {
        return new Boot();
    }
}
