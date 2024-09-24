package com.employeeseries.version3;

public class Name {
    public String fname;
    public String lname;
    public String mname;

    public Name() {

    }

    public Name(String lname, String fname, String mname) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }

    @Override
    public String toString() {
        return "First Name: " + fname + "\n" + "Middle Name: " + mname + "\n" + "Last Name: " + lname + "\n";
    }
}
