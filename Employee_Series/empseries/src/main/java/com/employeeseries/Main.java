package com.employeeseries;

import com.employeeseries.version1.BasedPlusCommissionEmployee;
import com.employeeseries.version1.CommissionEmployee;
import com.employeeseries.version1.HourlyEmployee;
import com.employeeseries.version1.PieceEmployee;

public class Main { public static void main(String[] args) {
  System.out.println("VERSION 1: ");
  displayVersion1();  
}


 

  public static void displayVersion1() {
    System.out.println("NON-DEFAULT CONSTRUCTORS USED: \n");
    // HOURLY
    HourlyEmployee hourEmp1 = new HourlyEmployee(41.25f, 25.5, "Yousif", "23100267");
    hourEmp1.displayHourlyEmployees();
    HourlyEmployee hourEmp2 = new HourlyEmployee("WatashiwaStah", "8672192");
    hourEmp2.displayHourlyEmployees_2();
    // PIECE
    PieceEmployee pieceEmp1 = new PieceEmployee(340, 24.7, "Quririco", "25100267");
    pieceEmp1.displayPieceEmployees();
    PieceEmployee pieceEmp2 = new PieceEmployee("Gnashal", "6237267");
    pieceEmp2.displayPieceEmployees_2();
    // COMMISSON
    CommissionEmployee commisionEmp1 = new CommissionEmployee(321312,"Ceballos", "26100267");
    commisionEmp1.displayCommissionEmployees();
    CommissionEmployee commisionEmp2 = new CommissionEmployee("Sollabec", "76200762");
    commisionEmp2.displayCommissionEmployees_2();
    // BASED PLUS
    BasedPlusCommissionEmployee BPEmp1 = new BasedPlusCommissionEmployee(213213, 5000.00, "Romero", "27100267");
    BPEmp1.displayBasedPlusCommissionEmployees();
    BasedPlusCommissionEmployee BPEmp2 = new BasedPlusCommissionEmployee("QuiQui", "1236456754");
    BPEmp2.displayBasedPlusCommissionEmployees_2();
  
    System.out.println("DEFAULT CONSTRUCTORS USED: \n\n");
    // HOURLY EMPLOYEES
    HourlyEmployee defHEmp = new HourlyEmployee();
    defHEmp.setEmpID("23100267");
    defHEmp.setEmpName("Yousif");
    defHEmp.setRatePerHour(25.25);
    defHEmp.setTotalHoursWorked(801.42f);
    defHEmp.displayHourlyDefault();
  
    // BPC EMPLOYEES
    BasedPlusCommissionEmployee bpcDef = new BasedPlusCommissionEmployee();
    bpcDef.setBaseSalary(1000.23);
    bpcDef.setEmpID("24100782");
    bpcDef.setEmpName("Quirico");
    bpcDef.setTotalSales(1000);
    bpcDef.displayBPCDefault();
  
    // COMMISSION EMPLOYEES
    CommissionEmployee cmDefEmp = new CommissionEmployee();
    cmDefEmp.setEmpID("25100231");
    cmDefEmp.setEmpName("Romero");
    cmDefEmp.setTotalSales(1232);
    cmDefEmp.displayCommDefault();
  
    // PIECE EMPLOYEE
    PieceEmployee pDefEmp = new PieceEmployee();
    pDefEmp.setEmpID("2613213");
    pDefEmp.setEmpName("Ceballos");
    pDefEmp.setRatePerPiece(27.23);
    pDefEmp.setTotalPiecesFinished(45654);
    pDefEmp.displayPEDefault();
  }
  
 
}
