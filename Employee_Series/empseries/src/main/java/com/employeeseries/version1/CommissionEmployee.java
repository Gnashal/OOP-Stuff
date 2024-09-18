package com.employeeseries.version1;

// -totalSales:double
// -empName:String
// -empID:int
// +computeSalary():double
//  -> less than  10,000 - 5% sales
//  -> less than 100,000 but greater than or eal to 10k - 10 % sales
//  -> less than 1M - 20% sales
//  -> above and equal to 1 M - 30% sales
// +displayHourlyEmployee():void
//  -> Employee ID: xxx
//     Employee Name: xxx
// +toString():String
//  -> similar with display

public class CommissionEmployee {
    private int totalSales;
    private String empName;
    private String empID;

    public CommissionEmployee() {}

    public CommissionEmployee (String empName, String empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public CommissionEmployee(int totalSales, String empName, String empID){
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
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



    @Override
    public String toString() {
        return "Total Sales: " + totalSales + "\n"+ "Employee Name: " + empName + "\n" + 
        "Employee ID: " + empID +"\n" + "Salary: " + computeSalary() + "\n";
    }

}
