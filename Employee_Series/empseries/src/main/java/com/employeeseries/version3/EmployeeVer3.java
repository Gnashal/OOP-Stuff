package com.employeeseries.version3;

public class EmployeeVer3 {
    public Name empName;
    public MyDate dateHired;
    public MyDate birthDate;
    public int id;

    public EmployeeVer3() {

    }
    public EmployeeVer3(Name name, MyDate hire,MyDate dob) {
        this.empName = new Name(name.getLname(), name.getFname(), name.getMname());
        this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
        this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
     }
     public EmployeeVer3(String fname, String lname, MyDate hire,MyDate dob) {
        this.empName = new Name(lname, fname);
        this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
        this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
     }

    public EmployeeVer3(Name name, MyDate hire,MyDate dob, int id) {
       this.empName = new Name(name.getLname(), name.getFname(), name.getMname());
       this.dateHired = new MyDate(hire.getDay(), hire.getMonth(), hire.getYear());
       this.birthDate = new MyDate(dob.getDay(), dob.getMonth(), dob.getYear());
       this.id = id;
    }
    public EmployeeVer3(Name name, int id) {
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
    public EmployeeVer3 getFullEmployeeVer3() {
        return this;
    }

    public void display(){
        empName.display();
        dateHired.display();
        birthDate.display();
        System.out.println(id);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Name: " + empName.fname + " " + empName.mname + " " + empName.lname;
    }



}

