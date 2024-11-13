package com.employeeseries.version7;

public abstract class Employee implements ComputeSalary{
    public Name empName;
    public MyDate dateHired;
    public MyDate birthDate;
    public int id;

    public Employee() {

    }
    public Employee(Name name, MyDate hire,MyDate dob) {
        this.empName = new Name(name.getLname(), name.getFname(), name.getMname());
        this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
        this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
     }
     public Employee(String fname, String lname, MyDate hire,MyDate dob) {
        this.empName = new Name(lname, fname);
        this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
        this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
     }

    public Employee(Name name, MyDate hire,MyDate dob, int id) {
       this.empName = new Name(name.getLname(), name.getFname(), name.getMname());
       this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
       this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
       this.id = id;
    }
    public Employee(Name name, int id) {
        this.empName = new Name(name.getLname(), name.getFname(), name.getMname());
        this.id = id;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    public void setEmpName(Name empName) {
        this.empName = empName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public MyDate getBirthDate() {
        return birthDate;
    }
    public MyDate getDateHired() {
        return dateHired;
    }
    public Name getEmpName() {
        return empName;
    }
    public int getId() {
        return id;
    }
    public Employee getFullEmployee() {
        return this;
    }

    public void display(){
        empName.display();
        dateHired.display();
        birthDate.display();
        System.out.println(id);
        System.out.println();
    }

    public abstract double computeSalary();

    @Override
    public String toString() {
        return "Name: " + empName.fname + " " + empName.mname + " " + empName.lname;
    }



}

