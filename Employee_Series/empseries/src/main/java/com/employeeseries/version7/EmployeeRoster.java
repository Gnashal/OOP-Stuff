package com.employeeseries.version7;

import java.util.ArrayList;

public class EmployeeRoster {
    public ArrayList<Employee> empRoster;
    public EmployeeRoster() {
        empRoster = new ArrayList<Employee>();
    }
    public ArrayList<Employee> getEmpRoster() {
        return empRoster;
    }
    public void addEmployee(Employee emp) {
        empRoster.add(emp);
    }
    public Employee removeEmployee (int ID) {
        if (empRoster.size() <= 0) {
            return null;
        }
        for (Employee employee : empRoster) {
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
            if(this.empRoster.get(i) instanceof Hourly){
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE(){
        int countCE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof Commission && !(this.empRoster.get(i) instanceof BasedPlus)){
                countCE++;
            }
        }
        return countCE;
    }
    
    public int countBPCE(){
        int countBPCE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof BasedPlus){
                countBPCE++;
            }
        }
        return countBPCE;
    }
    
    public int countPWE(){
        int countPWE = 0;
        for(int i = 0; i < empRoster.size(); i++){
            if(this.empRoster.get(i) instanceof Piece){
                countPWE++;
            }
        }
        return countPWE;
    }
    
    public void displayHE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof Hourly){
                    ((Hourly)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayCE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof Commission){
                    ((Commission)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayBPCE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof BasedPlus){
                    ((BasedPlus)this.empRoster.get(i)).display();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayPWE(){
        if(this.empRoster.size() > 0){
            for(int i = 0; i < empRoster.size(); i++){
                if(this.empRoster.get(i) instanceof Piece){
                    ((Piece)this.empRoster.get(i)).display();
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
        
        for (Employee emp : empRoster) {
            System.out.printf("%-10d | %-20s | %-15s | %-15s | $%-9.2f | %-20s%n", 
            emp.getId(), emp.empName.getFname(), emp.getDateHired().getFullDate(), 
            emp.getBirthDate().getFullDate(), emp.computeSalary(), emp.getClass().getSimpleName());
        }
    }
}
