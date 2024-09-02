/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myoop.activity2;

/**
 *
 * @author User
 */
public class Account {
    private double curr_balance;
    private double available_balance;
    private final String acc_name;
    private final int acc_num;
    
    public Account(double curr_balance, double available_balance, String acc_name, int acc_num) {
        this.curr_balance = curr_balance;
        this.available_balance = available_balance;
        this.acc_name = acc_name;
        this.acc_num = acc_num;
    }
    
    
    public void withdrawFee() {
       available_balance -= 10;
       curr_balance -= 10;
    }
    public boolean deposit(double amount) {
        if (amount > 0 && amount % 100 == 0) {
            this.curr_balance += amount;
            return true;
        } else {
            System.out.println("You dont have enough amount to proceed with the deposit\n");
        }
         return false;
    }
    
    public boolean withdraw(double amount) {
        if (amount < available_balance && available_balance > 10) {
            if (amount > 0 && amount % 100 == 0) {
            withdrawFee();
            this.available_balance -= amount;
//            this.curr_balance -= amount;
            return true;
            }
        } else {
            System.out.println("You dont have enough balance to proceed with the withdrawal\n");
        }
        return false;
    }
    
    public double checkBal() {
       return this.curr_balance;
    }
    
    public boolean transfer(double amount, Account acc) {
       if (acc.available_balance > 10 && amount > 0) {
           withdrawFee();
           acc.curr_balance += amount;
           return true;
       } else {
           System.out.println("You dont have enough balance to proceed with the transfer\n");
    }
       return false;
}       
    
    public void verify () {
        available_balance = curr_balance;
    }

    @Override
    public String toString() {
        return "\n" +"Current Balance:" + "\n" +curr_balance + "\n"+"Available Balance:" + 
                available_balance + "\n"+"Name: " + acc_name + "\n"+"Account ID:" + acc_num;
    }
    
}