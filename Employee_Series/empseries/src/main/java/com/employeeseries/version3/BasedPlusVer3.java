package com.employeeseries.version3;


public class BasedPlusVer3 extends CommissionVer3 {
    private double baseSalary;

    public BasedPlusVer3() {
        // Default constructor
    }

    public BasedPlusVer3(EmployeeVer3 e) {
        super(e);
        this.baseSalary = 0; // Initialize baseSalary as needed
    }

    public BasedPlusVer3(Name name, int id, int totalSales,MyDate date1, MyDate date2, double baseSalary) {
        super(totalSales, name,date1, date2, id);
        this.baseSalary = baseSalary;
    }

    public BasedPlusVer3(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlusVer3(Name name, int id, int totalSales) {
        super(name, id,totalSales);
        this.baseSalary = 0; // Initialize baseSalary as needed
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return this.baseSalary + super.computeSalary();
    }

    public void display() {
        System.out.println("Based Commission Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Base Salary: " + baseSalary + "\n";
    }
}
