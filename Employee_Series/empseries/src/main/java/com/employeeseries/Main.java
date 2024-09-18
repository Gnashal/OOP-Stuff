package com.employeeseries;

import com.employeeseries.version1.BasedPlusCommissionEmployee;
import com.employeeseries.version1.CommissionEmployee;
import com.employeeseries.version1.HourlyEmployee;
import com.employeeseries.version1.PieceEmployee;

public class Main { public static void main(String[] args) {
  System.out.println("NON-DEFAULT CONSTRUCTORS USED: \n");
  displayHourlyEmployees();
  displayPieceEmployees();
  displayCommissionEmployees();
  displayBasedPlusCommissionEmployees();

  System.out.println("DEFAULT CONSTRUCTORS USED: \n\n");
  HourlyEmployee defHEmp = new HourlyEmployee();
  defHEmp.setEmpID("23100267");
  defHEmp.setEmpName("Yousif");
  defHEmp.setRatePerHour(25.25);
  defHEmp.setTotalHoursWorked(801.42f);
  defHEmp.displayHourlyDefault();
}

  private static void displayHourlyEmployees() {
    System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Hours Worked", "Hourly Rate");
    System.out.println("-----------------------------------------------------------");
    
    HourlyEmployee hourEmp1 = new HourlyEmployee(41.25f, 25.5, "Yousif", "23100267");
    System.out.printf("%-20s %-15s %-15.2f $%-14.2f%n", hourEmp1.getEmpName(), hourEmp1.getEmpID(), hourEmp1.getTotalHoursWorked(), hourEmp1.getRatePerHour());

    HourlyEmployee hourEmp2 = new HourlyEmployee("WatashiwaStah", "8672192");
    System.out.printf("%-20s %-15s %-15s %-15s%n", hourEmp2.getEmpName(), hourEmp2.getEmpID(), "N/A", "N/A");
  }

  private static void displayPieceEmployees() {
    System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Pieces Made", "Piece Rate");
    System.out.println("-----------------------------------------------------------");
    
    PieceEmployee pieceEmp1 = new PieceEmployee(340, 24.7, "Quririco", "25100267");
    System.out.printf("%-20s %-15s %-15d $%-14.2f%n", pieceEmp1.getEmpName(), pieceEmp1.getEmpID(), pieceEmp1.getTotalPiecesFinished(), pieceEmp1.getRatePerPiece());

    PieceEmployee pieceEmp2 = new PieceEmployee("Gnashal", "6237267");
    System.out.printf("%-20s %-15s %-15s %-15s%n", pieceEmp2.getEmpName(), pieceEmp2.getEmpID(), "N/A", "N/A");
  }

  private static void displayCommissionEmployees() {
    System.out.printf("%-20s %-15s %-15s%n", "Name", "ID", "Commission");
    System.out.println("-----------------------------------------------------------");
    
    CommissionEmployee commisionEmp1 = new CommissionEmployee(321312,"Ceballos", "26100267");
    System.out.printf("%-20s %-15s $%-14d%n", commisionEmp1.getEmpName(), commisionEmp1.getEmpID(), commisionEmp1.getTotalSales());

    CommissionEmployee commisionEmp2 = new CommissionEmployee("Sollabec", "76200762");
    System.out.printf("%-20s %-15s %-15s%n", commisionEmp2.getEmpName(), commisionEmp2.getEmpID(), "N/A");
  }

  private static void displayBasedPlusCommissionEmployees() {
    System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Commission", "Base Salary");
    System.out.println("-----------------------------------------------------------");
    
    BasedPlusCommissionEmployee BPEmp1 = new BasedPlusCommissionEmployee(213213, 5000.00, "Romero", "27100267");
    System.out.printf("%-20s %-15s $%-14d $%-14.2f%n", BPEmp1.getEmpName(), BPEmp1.getEmpID(), BPEmp1.getTotalSales(), BPEmp1.getBaseSalary());

    BasedPlusCommissionEmployee BPEmp2 = new BasedPlusCommissionEmployee("QuiQui", "1236456754");
    System.out.printf("%-20s %-15s %-15s %-15s%n", BPEmp2.getEmpName(), BPEmp2.getEmpID(), "N/A", "N/A");
  }

 
}
