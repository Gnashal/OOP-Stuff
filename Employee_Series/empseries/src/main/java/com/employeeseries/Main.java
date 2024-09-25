package com.employeeseries;

import com.employeeseries.version1.BasedPlusCommissionEmployee;
import com.employeeseries.version1.CommissionEmployee;
import com.employeeseries.version1.HourlyEmployee;
import com.employeeseries.version1.PieceEmployee;
import com.employeeseries.version2.BasedPlus;
import com.employeeseries.version2.Commission;
import com.employeeseries.version2.Employee;
import com.employeeseries.version2.Hourly;
import com.employeeseries.version2.Piece;
import com.employeeseries.version3.EmployeeVer3;
import com.employeeseries.version3.HourlyVer3;
import com.employeeseries.version3.MyDate;
import com.employeeseries.version3.Name;

public class Main { public static void main(String[] args) {
  System.out.println("VERSION 1: ");
  displayVersion1();  

  System.out.println("VERSION 2: ");
  displayVersion2();  

  System.out.println("VERSION 3: ");
  displayVersion3();  
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



  public static void displayVersion2() {
    System.out.println("NON-DEFAULT CONSTRUCTORS USED: \n");

    // HOURLY EMPLOYEES
    Hourly hourlyEmp1 = new Hourly(41.25f, 25.5, "Yousif", 23100267);
    hourlyEmp1.displayHourlyEmployees();
    
    Hourly hourlyEmp2 = new Hourly("WatashiwaStah", 8672192);
    hourlyEmp2.setHourlyRate(5546.23);
    hourlyEmp2.setHoursWorked(2323.67f);
    hourlyEmp2.displayHourlyEmployees();

    // PIECE EMPLOYEES
    Employee empP = new Employee( "Quririco", 25100267);
    Piece pieceEmp1 = new Piece(empP,340, 24.7);
    pieceEmp1.displayPieceEmployees();
    
    Piece pieceEmp2 = new Piece("Gnashal", 6237267);
    pieceEmp2.setRatePerPiece(98123.10);
    pieceEmp2.setTotalPiecesFinished(10000);

    // COMMISSION EMPLOYEES
    Commission commissionEmp1 = new Commission(321312, "Ceballos", 26100267);
    commissionEmp1.displayCommisionEmployees();
    
    Commission commissionEmp2 = new Commission("Sollabec", 76200762);
    commissionEmp2.setTotalSales(1231231);
    commissionEmp2.displayCommisionEmployees();

    // BASED PLUS EMPLOYEES
    BasedPlus basedPlusEmp1 = new BasedPlus("Romero", 27100267, 213213, 5000.00);
    basedPlusEmp1.displayBasedCommisionEmployees();
    
    BasedPlus basedPlusEmp2 = new BasedPlus("QuiQui", 1236456754, 0, 0);
    basedPlusEmp2.setBaseSalary(8979.23);
    basedPlusEmp2.setTotalSales(231231);
    basedPlusEmp2.displayBasedCommisionEmployees();

    System.out.println("DEFAULT CONSTRUCTORS USED: \n\n");

    // HOURLY EMPLOYEES DEFAULT
    Hourly defHourlyEmp = new Hourly();
    defHourlyEmp.setId(23100267);
    defHourlyEmp.setName("Yousif");
    defHourlyEmp.setHourlyRate(25.25);
    defHourlyEmp.setHoursWorked(801.42f);
    defHourlyEmp.displayEmployee();
    defHourlyEmp.displayHourlyEmployees();

    // BASED PLUS COMMISSION EMPLOYEES DEFAULT
    BasedPlus defBasedPlus = new BasedPlus();
    defBasedPlus.setBaseSalary(1000.23);
    defBasedPlus.setId(24100782);
    defBasedPlus.setName("Quirico");
    defBasedPlus.setTotalSales(1000);
    defBasedPlus.displayEmployee();
    defBasedPlus.displayBasedCommisionEmployees();

    // COMMISSION EMPLOYEES DEFAULT
    Commission defCommissionEmp = new Commission();
    defCommissionEmp.setId(25100231);
    defCommissionEmp.setName("Romero");
    defCommissionEmp.setTotalSales(1232);
    defCommissionEmp.displayEmployee();
    defCommissionEmp.displayCommisionEmployees();

    // PIECE EMPLOYEES DEFAULT
    Piece defPieceEmp = new Piece();
    defPieceEmp.setId(2613213);
    defPieceEmp.setName("Ceballos");
    defPieceEmp.setRatePerPiece(27.23);
    defPieceEmp.setTotalPiecesFinished(45654);
    defPieceEmp.displayEmployee();
    defPieceEmp.displayPieceEmployees();
}

public static void displayVersion3() {
  // EMPLOYEE
  EmployeeVer3 employee1 = new EmployeeVer3(
    new Name("Yousif", "Ceballos", "Romero"), 
    new MyDate(23, 9, 2005), 
    new MyDate(18, 10, 2004), 
    23100267);
  employee1.display();
  EmployeeVer3 employee2 = new EmployeeVer3(
    new Name("Haruhi", "Suzumiya"), 
    new MyDate(23, 9, 2005), 
    new MyDate(18, 10, 2004), 
    23100267);
  employee2.display();

  HourlyVer3 hourlyEmpV3_1 = new HourlyVer3(42.00f, 900.23, employee1);
  hourlyEmpV3_1.displayHourlyEmployees();
}

  
 
}
