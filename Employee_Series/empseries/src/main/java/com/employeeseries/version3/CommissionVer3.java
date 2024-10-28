package com.employeeseries.version3;

public class CommissionVer3 extends EmployeeVer3 {
    private int totalSales;

    public CommissionVer3() {
        // Default constructor
    }

    public CommissionVer3(EmployeeVer3 e) {
        super(e.empName.getFullName(), e.dateHired.getFullDate(), e.birthDate.getFullDate(), e.getId());
    }

    public CommissionVer3(Name name, int id) {
        super(name, id);
    }

    public CommissionVer3(int totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionVer3(int totalSales, Name name, MyDate hireday, MyDate bday, int id) {
        super(name, hireday, bday, id);
        this.totalSales = totalSales;
    }

    public CommissionVer3(EmployeeVer3 e, int totalSales) {
        super(e.empName.getFullName(), e.getId());
        this.totalSales = totalSales;
    }
    public CommissionVer3(Name name, int id, int totalSales) {
        super(name, id);
        this.totalSales = totalSales;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        double salary = 0;
        if (totalSales < 10000) {
            salary += totalSales / 0.5;
        } else if (totalSales < 100000) {
            salary += totalSales / 0.10;
        } else if (totalSales < 1000000) {
            salary += totalSales / 0.20;
        } else {
            salary += totalSales / 0.30;
        }

        return salary;
    }

    public void display() {
        System.out.println("Commission Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Total Sales: " + totalSales + "\n";
    }
}
