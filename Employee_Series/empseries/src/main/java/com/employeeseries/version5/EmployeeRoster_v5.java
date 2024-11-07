package com.employeeseries.version5;

import java.util.ArrayList;

import com.employeeseries.version3.EmployeeVer3;

public class EmployeeRoster_v5 {
    public ArrayList<EmployeeVer3> empRoster;
    public EmployeeRoster_v5() {
        empRoster = new ArrayList<EmployeeVer3>();
    }
    public ArrayList<EmployeeVer3> getEmpRoster() {
        return empRoster;
    }
    public void addEmployee(EmployeeVer3 emp) {
        empRoster.add(emp);
    }
}
