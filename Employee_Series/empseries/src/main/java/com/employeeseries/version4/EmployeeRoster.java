package com.employeeseries.version4;

import com.employeeseries.version3.*;

public class EmployeeRoster {
    private int max;
    private EmployeeVer3[] empList = new EmployeeVer3[max];
    private int count;

    public EmployeeRoster() {

    }
    public EmployeeRoster(int max) {
        this.max = max;
    }

    public boolean addEmployee(EmployeeVer3 newEmp) {
        if (count < max) {
            empList[count++] = newEmp;
            return true;
        }
        return false;
    }
    public EmployeeVer3 removeEmployee(int id) {
        EmployeeVer3 removedEmp = new EmployeeVer3();
        if (count >= 0) {
            for (int i = 0; i < count; ++i) {
                if (empList[i].id == id) {
                    removedEmp = empList[i];
                    for ( int j = i; j < count; ++j) {
                        empList[j] = empList[j + 1];
                    }
                    empList[count - 1] = null;
                    --count;
                }
            }
        }
        return removedEmp;
    }

    public int countHE() {
        int count = 0;
        for (int i = 0; i < this.count; ++i) {
            if (empList[i] instanceof HourlyVer3) count++;
        }
        return count;
    }
    public int countCE() {
        int count = 0;
        for (int i = 0; i < this.count; ++i) {
            if (empList[i] instanceof CommissionVer3) count++;
        }
        return count;
    }
    public int countBCPE() {
        int count = 0;
        for (int i = 0; i < this.count; ++i) {
            if (empList[i] instanceof BasedPlusVer3) count++;
        }
        return count;
    }
    public int countPWE() {
        int count = 0;
        for (int i = 0; i < this.count; ++i) {
            if (empList[i] instanceof PieceVer3) count++;
        }
        return count;
    }
    public void displayHE() {
        for (int i = 0; i < countHE(); ++i) {
            if (empList[i] instanceof HourlyVer3) {
                ((HourlyVer3)empList[i]).display();
            } else {
                continue;
            }
        }
    }
    public void displayCE(){
        for (int i = 0; i < countCE(); ++i) {
            if (empList[i] instanceof CommissionVer3) {
                ((CommissionVer3)empList[i]).display();
            } else {
                continue;
            }
        }
    }
    public void displayPWE() {
        for (int i = 0; i < countPWE(); ++i) {
            if (!(empList[i] instanceof PieceVer3)) {
                continue;
            } else {
                ((PieceVer3)empList[i]).display();
            }
        }
    }
    public void displayBCPE() {
        for (int i = 0; i < countPWE(); ++i) {
            if (!(empList[i] instanceof BasedPlusVer3)) {
                continue;
            } else {
                ((BasedPlusVer3)empList[i]).display();
            }
        }
    }

    public void displayAllEmployees() {
        System.out.printf("%-10s | %-20s | %-15s | %-15s | %-10s | %-20s%n", 
                          "ID", "NAME", "HIREDATE", "BIRTHDAY", "SALARY", "TYPE OF EMPLOYEE");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    
        for (int i = 0; i < count; i++) {
            EmployeeVer3 emp = empList[i];
            
            String type = "";
            double salary = 0;
    
            if (emp instanceof HourlyVer3) {
                salary = ((HourlyVer3) emp).computeSalary();
                type = "Hourly Employee";
            } else if (emp instanceof CommissionVer3) {
                salary = ((CommissionVer3) emp).computeSalary();
                type = "Commission Employee";
            } else if (emp instanceof BasedPlusVer3) {
                salary = ((BasedPlusVer3) emp).computeSalary();
                type = "BasedPlus Employee";
            } else if (emp instanceof PieceVer3) {
                salary = ((PieceVer3) emp).computeSalary();
                type = "Piece Employee";
            }
    
            System.out.printf("%-10d | %-20s | %-15s | %-15s | $%-9.2f | %-20s%n", 
                              emp.getId(), emp.empName.getFullName(), emp.getDateHired().getFullDate(), 
                              emp.getBirthDate().getFullDate(), salary, type);
        }
    }
    
}
