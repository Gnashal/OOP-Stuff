/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myoop.activity2;

/**
 *
 * @author User
 */
public class Activity2  {
    
//    private static Account acc;
//    private static Account acc2;
    private static Vehicle vehicle1;
    public static void main(String[] args) {
//        acc = new Account(1000, 1000, "Yousif", 23100267);
//        acc2 = new Account(2000, 2000, "Quirico", 23200289);
//        System.out.println(acc);
//        System.out.println(acc2);
//        acc.deposit(5000);
//        System.out.println(acc);
//        acc.withdraw(2000);
//        System.out.println(acc);
        vehicle1 = new Vehicle(100, "Red", "Vios", "Toyota", "GAP1324");
        System.out.println(vehicle1);
        for (int i = 0;  i < 11; ++i) {
            vehicle1.accel();
        }
          System.out.println(vehicle1);
          vehicle1.repair(vehicle1);
          System.out.println(vehicle1);
    }
}
