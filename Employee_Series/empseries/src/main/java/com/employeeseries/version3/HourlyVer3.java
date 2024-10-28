package com.employeeseries.version3;


public class HourlyVer3 extends EmployeeVer3{
    private float hoursWorked;
    private double hourlyRate;

    public HourlyVer3() {

    }
    public HourlyVer3(EmployeeVer3 emp) {
        super(emp.empName.getFullName(), emp.getDateHired(), emp.getBirthDate(), emp.getId());
    }

    public HourlyVer3(Name name, MyDate hire, MyDate dob) {
        super(name.getFullName(), hire.getFullDate(),dob.getFullDate());
    }

    public HourlyVer3(Name name, int id) {
        super(name.getFullName(), id);
    }

    public HourlyVer3(float hoursWorked, double hourlyRate, EmployeeVer3 emp) {
        super(emp.empName.getFullName(), emp.getDateHired(), emp.getBirthDate(), emp.getId());
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    public HourlyVer3(float hoursWorked, double hourlyRate, Name name, int id) {
        super(name.getFullName(), id);
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
            salary = (hoursWorked * hw) * hoursWorked;
        } else {
            salary = (hoursWorked * hourlyRate);
        }

        return salary;
    }
    @Override
    public void display() {
        System.out.println("Hourly Employee: ");
        super.display();
        System.out.println("Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+ "Hours Worked: " + hoursWorked + "\n"
        + "Hourly Rate: " + hourlyRate + "\n";
    }
}
