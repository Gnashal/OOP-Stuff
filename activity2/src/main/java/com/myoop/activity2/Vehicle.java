/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myoop.activity2;

/**
 *
 * @author User
 */
public class Vehicle  {
    private int top_speed;
    private int current_speed;
    private String color;
    private String model;
    private String manufacuter;
    private String plate_number;
    private Status isDead;
    
    public enum Status {
        WORKING, DISABLED;
    }
    
    public Vehicle(int top_speed, String color, String model, String manufacuter, String plate_number) {
        this.top_speed = top_speed;
        this.current_speed = 0;
        this.color = color;
        this.model = model;
        this.manufacuter = manufacuter;
        this.plate_number = plate_number;
        this.isDead = Status.WORKING;
    }
    
    
    
    public boolean accel() {
       if (current_speed < top_speed && isDead == Status.WORKING) {
           current_speed += 10;
           System.out.println("A " + manufacuter+ " " + model+ " travelling " + current_speed + " " + "to " + top_speed + "\n");
           return true;
       } else {
           isDead = Status.DISABLED;
           System.out.println("The car has combusted and everyone inside has died\n");
       }
       
       return false;
    }
    
    public boolean decel() {
        if (current_speed >= 0) {
            this.current_speed -= 10;
             System.out.println("A " + manufacuter+ " " + model+ " travelling " + current_speed + " " + "to " + top_speed + "\n");
            return true;
        } else {
            System.out.println("Car has fully stopped");
        }
        return false;
    }
    
    public void repair(Vehicle v) {
        if (v.isDead == Status.WORKING) {
            System.out.println("Car is still in working condition\n");
        } else {
            v.isDead = Status.WORKING;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{");
        sb.append("Top Speed: ").append(top_speed);
        sb.append("Current Speed: ").append(current_speed);
        sb.append("Color: ").append(color);
        sb.append("Model: ").append(model);
        sb.append("Manufacturer: ").append(manufacuter);
        sb.append("Plate Number: ").append(plate_number);
        sb.append("Car Status: ").append(isDead);
        sb.append('}');
        return sb.toString();
    }

    

    
    
}
