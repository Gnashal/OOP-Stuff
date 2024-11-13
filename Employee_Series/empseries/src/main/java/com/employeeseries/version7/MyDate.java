package com.employeeseries.version7;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public MyDate getFullDate() {
        return this;
    }

    public void display() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
