package com.employeeseries.version2;

public class Hourly extends Employee{
    private float hoursWorked;
    private double hourlyRate;

    public Hourly() {

    }
    public Hourly(Employee emp) {
        super(emp.getName(), emp.getId());
    }
    public Hourly(Employee  emp, String name, int id) {
        super(name, id);
    }
    public Hourly (float hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public Hourly (Employee emp, float hoursWorked, double hourlyRate) 
    {
        super(emp.name, emp.id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public Hourly (Employee emp, float hoursWorked, double hourlyRate, String name, int id) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

}
