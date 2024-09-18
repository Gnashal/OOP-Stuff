package com.employeeseries.version1;

// -totalSales:double
// -baseSalary:double
// -empName:String
// -empID:int
// +computeSalary():double
//  -> less than  10,000 - 5% sales
//  -> less than 100,000 but greater than or eal to 10k - 10 % sales
//  -> less than 1M - 20% sales
//  -> above and equal to 1 M - 30% sales
//  ->commision + base salry
// +displayHourlyEmployee():void
//  -> Employee ID: xxx
//     Employee Name: xxx
// +toString():String
//  -> similar with display

public class BasedPlusCommissionEmployee {
    private int totalSales;
    private double baseSalary;
    private String empName;
    private String empID;

    public BasedPlusCommissionEmployee() {}

    
    public BasedPlusCommissionEmployee (String empName, String empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public BasedPlusCommissionEmployee(int totalSales, double baseSalary,String empName, String empID){
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public int getTotalSales() {
        return totalSales;
    }


    public double computeSalary() {
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
    
    public void displayBPCDefault() {
    
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Base Salary", "Total Sales");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15.2f $%-14d%n\n", getEmpName(), getEmpID(), getBaseSalary(), getTotalSales());
      }

    @Override
    public String toString() {
        return "Total Sales: " + totalSales + "\n"+ "Base Salary: " + baseSalary + "\n" + "Employee Name: " + empName + "\n" + 
        "Employee ID: " + empID +"\n" + "Salary: " + computeSalary() + "\n";
    }
}
