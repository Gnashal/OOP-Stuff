package com.employeeseries.version7;


public class Hourly extends Employee{
    private float hoursWorked;
    private double hourlyRate;

    public Hourly() {

    }
    public Hourly(Employee emp) {
        super(emp.empName.getFullName(), emp.getDateHired(), emp.getBirthDate(), emp.getId());
    }

    public Hourly(Name name, MyDate hire, MyDate dob) {
        super(name.getFullName(), hire.getFullDate(),dob.getFullDate());
    }

    public Hourly(Name name, int id) {
        super(name.getFullName(), id);
    }

    public Hourly(float hoursWorked, double hourlyRate, Employee emp) {
        super(emp.empName.getFullName(), emp.getDateHired(), emp.getBirthDate(), emp.getId());
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    public Hourly(float hoursWorked, double hourlyRate, Name name, int id) {
        super(name.getFullName(), id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public Hourly(Name name, MyDate hire, MyDate dob, int id, float hourlyRate, float hoursWorked) {
        super(name, id);
        super.setBirthDate(dob);
        super.setDateHired(hire);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
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

    @Override
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
