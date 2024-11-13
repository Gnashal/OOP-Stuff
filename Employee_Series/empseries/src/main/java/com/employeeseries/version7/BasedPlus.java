package com.employeeseries.version7;


public class BasedPlus extends Commission{
    private double baseSalary;

    public BasedPlus() {
        // Default constructor
    }

    public BasedPlus(Employee e) {
        super(e);
        this.baseSalary = 0; // Initialize baseSalary as needed
    }

    public BasedPlus(Name name, int id, int totalSales,MyDate date1, MyDate date2, double baseSalary) {
        super(totalSales, name,date1, date2, id);
        this.baseSalary = baseSalary;
    }

    public BasedPlus(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlus(Name name, int id, int totalSales) {
        super(name, id,totalSales);
        this.baseSalary = 0; // Initialize baseSalary as needed
    }
    public BasedPlus(Name name, MyDate hire, MyDate dob, int id, int totalSales, double baseSalary) {
        super(name, hire, dob, id, totalSales);
        this.baseSalary = baseSalary;
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
    @Override
    public void display() {
        System.out.println("Based Commission Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Base Salary: " + baseSalary + "\n";
    }
}
