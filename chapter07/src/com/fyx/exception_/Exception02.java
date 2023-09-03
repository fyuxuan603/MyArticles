package com.fyx.exception_;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-23:09
 */
public class Exception02 {
    public static void main(String[] args) {

 try {
        FileInputStream fis;
        fis = new FileInputStream("d:\\aa.jpg");
        int len;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
        fis.close();
    } catch (
    IOException e) {
        e.printStackTrace();
    }

}
}
