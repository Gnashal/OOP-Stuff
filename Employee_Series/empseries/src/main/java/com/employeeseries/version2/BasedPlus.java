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
        int totalSales = super.totalSales;
        if (totalSales < 10000) {
         baseSalary += totalSales / 0.5;
        } else if (totalSales < 100000 && totalSales >= 10000) {
         baseSalary += totalSales / 0.10;
        } else if (totalSales < 1000000) {
         baseSalary += totalSales / 0.20;
        } else if (totalSales >= 1000000) {
         baseSalary += totalSales / 0.30;
        }
        return this.baseSalary;
     }



    @Override
    public void setTotalSales(int totalSales) {
        super.setTotalSales(totalSales);
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    @Override
    public int getId() {
        return super.getId();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getTotalSales() {
        return super.getTotalSales();
    }

    @Override
    public String toString() {
        return super.toString() + "Base Salary: " + baseSalary + "\n";
    }
}
