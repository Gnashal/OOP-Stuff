package com.employeeseries.version6;

public class Commission extends Employee {
    private int totalSales;

    public Commission() {
        // Default constructor
    }

    public Commission(Employee e) {
        super(e.empName.getFullName(), e.dateHired.getFullDate(), e.birthDate.getFullDate(), e.getId());
    }

    public Commission(Name name, int id) {
        super(name, id);
    }

    public Commission(int totalSales) {
        this.totalSales = totalSales;
    }

    public Commission(int totalSales, Name name, MyDate hireday, MyDate bday, int id) {
        super(name, hireday, bday, id);
        this.totalSales = totalSales;
    }

    public Commission(Employee e, int totalSales) {
        super(e.empName.getFullName(), e.getId());
        this.totalSales = totalSales;
    }
    public Commission(Name name, int id, int totalSales) {
        super(name, id);
        this.totalSales = totalSales;
    }
    public Commission(Name name, MyDate hire, MyDate dob, int id, int totalSales) {
        super(name, id);
        super.setBirthDate(dob);
        super.setDateHired(hire);
        this.totalSales = totalSales;
    }
    

    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    @Override
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

    @Override
    public void display() {
        System.out.println("Commission Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Total Sales: " + totalSales + "\n";
    }
}
