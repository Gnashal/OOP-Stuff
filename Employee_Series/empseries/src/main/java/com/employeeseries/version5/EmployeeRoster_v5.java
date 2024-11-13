package com.employeeseries.version5;

import java.util.ArrayList;


import com.employeeseries.version3.*;

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
    public EmployeeVer3 removeEmployee (int ID) {
        if (empRoster.size() <= 0) {
            return null;
        }
        for (EmployeeVer3 employee : empRoster) {
            if (employee.getId() == ID) {
                empRoster.remove(employee);
                return employee;
            }
        }
        return null;
    }

     public int countHE(){
        int countHE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof HourlyVer3){
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE(){
        int countCE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof CommissionVer3 && !(this.empRoster.get(i) instanceof BasedPlusVer3)){
                countCE++;
            }
        }
        return countCE;
    }
    
    public int countBPCE(){
        int countBPCE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof BasedPlusVer3){
                countBPCE++;
            }
        }
        return countBPCE;
    }
    
    public int countPWE(){
        int countPWE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof PieceVer3){
                countPWE++;
            }
        }
        return countPWE;
    }
    
    public void displayHE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof HourlyVer3){
                    ((HourlyVer3)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayCE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof CommissionVer3){
                    ((CommissionVer3)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayBPCE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof BasedPlusVer3){
                    ((BasedPlusVer3)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayPWE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof PieceVer3){
                    ((PieceVer3)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }

    public void displayAllEmployees() {
        System.out.printf("%-10s | %-20s | %-15s | %-15s | %-10s | %-20s%n", 
        "ID", "NAME", "HIREDATE", "BIRTHDAY", "SALARY", "TYPE OF EMPLOYEE");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    
        for (int i = 0; i < empRoster.size(); i++) {
            EmployeeVer3 emp = empRoster.get(i);
            
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
            emp.getId(), emp.empName.getFname(), emp.getDateHired().getFullDate(), 
            emp.getBirthDate().getFullDate(), salary, type);
        }
    }
}
