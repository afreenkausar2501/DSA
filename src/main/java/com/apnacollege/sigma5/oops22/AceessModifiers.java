package com.apnacollege.sigma5.oops22;

public class AceessModifiers {
    public static void main(String[] args) {
        BankAccount myAc = new BankAccount();
        myAc.username = "afreenkausar";
        myAc.setPassword("abcd@123");

    }
    
}
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
