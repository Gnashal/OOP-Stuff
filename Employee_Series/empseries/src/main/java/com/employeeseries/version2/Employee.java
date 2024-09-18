package com.employeeseries.version2;

public class Employee {
    public int id;
    public String name;

    public Employee() {}
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayEmployee() {
        System.out.printf("%-20s %-15s%n", "Name", "ID");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-15sf%n\n", getName(), getId());
    }
}
