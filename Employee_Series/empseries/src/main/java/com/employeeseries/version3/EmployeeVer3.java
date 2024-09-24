package com.employeeseries.version3;

public class EmployeeVer3 {
    public Name empName;
    public MyDate dateHired;
    public int id;

    public EmployeeVer3() {

    }

    public EmployeeVer3(Name empName, MyDate date, int id) {
        this.empName = empName;
        this.dateHired = date;
        this.id = id;
    }
}
