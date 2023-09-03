package com.fyx.interface_;
//Phone 类 实现 UsbInterface
//解读: 即 Phone类 需要实现 UsbInterface接口 规定/声明的方法
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作.....");
    }
}
