package com.employeeseries.version2;

public class BasedPlus extends Commission{
    private double baseSalary;

    public BasedPlus(){

    }
    public BasedPlus(Employee e, Commission c) {
        super(e, c.totalSales);
    }
    public BasedPlus(String name, int id, int totalSales, double baseSalary) {
        super(totalSales, name, id);
        this.baseSalary = baseSalary;
    }
    public BasedPlus (double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public BasedPlus (String name, int id, int totalSales) {
        super(totalSales, name, id);
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return this.baseSalary + super.computeSalary();
     }

     public void displayBasedCommisionEmployees() {
        System.out.println("Commision Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }


    @Override
    public String toString() {
        return super.toString() + "Base Salary: " + baseSalary + "\n";
    }
}
