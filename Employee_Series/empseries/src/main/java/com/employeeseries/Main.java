package com.employeeseries;

import com.employeeseries.version1.BasedPlusCommissionEmployee;
import com.employeeseries.version1.CommissionEmployee;
import com.employeeseries.version1.HourlyEmployee;
import com.employeeseries.version1.PieceEmployee;

public class Main {
    public static void main(String[] args) {
      HourlyEmployee emp1 = new HourlyEmployee(41.25f, 25.5, "Yousif", "23100267");
      PieceEmployee emp2 = new PieceEmployee(340, 24.7, "Quririco", "25100267");
      CommissionEmployee emp3 = new CommissionEmployee(213213,"Ceballos", "26100267");
      BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(213213,5000.000,"Romero", "27100267");

      System.out.println(emp1);
      System.out.println(emp2);
      System.out.println(emp3);
      System.out.println(emp4);
    }
}