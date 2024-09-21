package com.employeeseries.version2;

public class Commission extends Employee {
    private int totalSales;

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
}
