package com.employeeseries.version2;

public class Commission extends Employee {
    public int totalSales;

    public Commission() {
    }

    public Commission(Employee e) {
        super(e.getName(), e.getId());
    }

    public Commission(String name, int id) {
        super(name, id);
    }

    public Commission(int totalSales) {
        this.totalSales = totalSales;
    }

    public Commission(int totalSales, String name, int id) {
        super(name, id);
        this.totalSales = totalSales;
    }

    public Commission(Employee e, int totalSales) {
        super(e.getName(), e.getId());
        this.totalSales = totalSales;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        float salary = 0;
        if (totalSales < 10000) {
            salary += totalSales / 0.5;
        } else if (totalSales < 100000 && totalSales >= 10000) {
            salary += totalSales / 0.10;
        } else if (totalSales < 1000000) {
            salary += totalSales / 0.20;
        } else if (totalSales >= 1000000) {
            salary += totalSales / 0.30;
        }

        return salary;
    }

    public void displayCommisionEmployees() {
        System.out.println("Commision Employee: " + toString() + "Computed Salary:  " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Total Sales: " + totalSales + "\n";
    }
}
