package com.fyx.stringbuffer_;

/**
 * @author 冯宇轩
 * @version 1.0
 * creates 2023-02-17:13
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
        sb.append(str);//需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull
        //将 空 转成了 n u l l 这个字符串
        System.out.println(sb.length());//4

        System.out.println(sb);//null
        //下面的构造器，会抛出NullpointerException
        StringBuffer sb1 = new StringBuffer(str);//看底层源码 super(str.length() + 16);
        System.out.println(sb1);

    }
}
