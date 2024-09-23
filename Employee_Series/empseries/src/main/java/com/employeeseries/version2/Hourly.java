package com.employeeseries.version2;

public class Hourly extends Employee {
    private float hoursWorked;
    private double hourlyRate;

    public Hourly() {

    }

    public Hourly(Employee emp) {
        super(emp.getName(), emp.getId());
    }

    public Hourly(String name, int id) {
        super(name, id);
    }

    public Hourly(float hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    public Hourly(float hoursWorked, double hourlyRate, String name, int id) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
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
    public void displayHourlyEmployees() {
        System.out.println("Hourly Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Hours Worked: " + hoursWorked + "\n"
        + "Hourly Rate: " + hourlyRate + "\n";
    }

}
