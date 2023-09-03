package com.fyx.wrapper_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-11:08
 */
import java.util.*;
public class runnian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份");
        String year = sc.next();
        try {
            if (fun(year) == 1){
                System.out.println(year+"是闰年");
            } else {
                System.out.println(year+"不是闰年");
            }
        } catch (Exception e) {
            System.out.println("输入年份有误");
        }
    }
        public static int fun (String year){
            if (Integer.valueOf(year) % 4 == 0 && Integer.valueOf(year) % 100 != 0 || Integer.valueOf(year) % 400 == 0) {
                return 1;
            }
            return 0;
        }
}
