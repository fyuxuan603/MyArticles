package com.fyx.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(600);
        account.setPwd("123456");

        account.showInfo();
    }
}
