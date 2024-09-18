package com.employeeseries.version1;

// HourlyEmployee
// -totalHoursWorked:float
// -ratePerHour:double
// -empName:String
// -empID:int
// +computeSalary():double
//  -> total hours worked * rate per hour
//  -> overtime will be paid 150%
//  -> when it is over 40 hours
// +displayHourlyEmployee():void
//  -> Employee ID: xxx
//     Employee Name: xxx
// +toString():String
//  -> similar with display

public class HourlyEmployee {
    private float hoursWorked;
    private double hourlyRate;
    private String empName;
    private String empID;
    

    public HourlyEmployee(){

    }

    public HourlyEmployee (String empName, String empID) {
        this.empName = empName;
        this.empID = empID;
    }
    

    public HourlyEmployee(float hoursWorked, double hourlyRate, String empName, String empID){
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.empName = empName;
        this.empID = empID;
    }

    public float getTotalHoursWorked() {
        return hoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.hoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return hourlyRate;
    }

    public void setRatePerHour(double ratePerHour) {
        this.hourlyRate = ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    
    public double computeSalary() {
        double hw = hoursWorked;
        double salary = 0;
        double bonus = 1.5;
        if (hw > 40) {
            hw -= 40;
            hw *= bonus;
            salary = (hoursWorked * hourlyRate) * hw;
        } else {
            salary = (hoursWorked * hourlyRate);
        }

        return salary;
    }
    public void displayHourlyDefault() {
    
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Hours Worked", "Hourly Rate");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15.2f $%-14.2f%n", getEmpName(), getEmpID(), getTotalHoursWorked(), getRatePerHour());
      }
    


    @Override
    public String toString() {
        return "Hours Worked: " + hoursWorked + "\n"+"Hourly Rate: " + hourlyRate + "\n" + "Employee Name: " + empName + "\n" + 
        "Employee ID: " + empID +"\n" + "Salary: " + computeSalary() + "\n";
    }

}