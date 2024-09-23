package com.employeeseries.version1;


// -totalPiecesFinished:int
// -ratePerPiece:double
// -empName:String
// -empID:int
// +computeSalary():double
//  -> total pieces finished * rate per piece
//  -> in every hundred pieces finished an aditional bonus of 10*rate per piece
// +displayHourlyEmployee():void
//  -> Employee ID: xxx
//     Employee Name: xxx
// +toString():String
//  -> similar with display
public class PieceEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private String empID;

   public PieceEmployee() {}

   public PieceEmployee (String empName, String empID) {
    this.empName = empName;
    this.empID = empID;
}

    public PieceEmployee(int totalPiecesFinished, double ratePerPiece, String empName, String empID){
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }



    public double computeSalary() {
        float salary = 0;
        while (totalPiecesFinished >= 100) {
            ratePerPiece *= 10;
            totalPiecesFinished -= 100;
        }

       return salary += totalPiecesFinished * ratePerPiece;
    }

    public void displayPEDefault() {
    
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Rate Per Piece", "Total Pieces Finished");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15.2f $%-14d%n\n", getEmpName(), getEmpID(), getRatePerPiece(), getTotalPiecesFinished());
      }

      public void displayPieceEmployees() {
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Pieces Made", "Piece Rate");
        System.out.println("-----------------------------------------------------------");    
        System.out.printf("%-20s %-15s %-15d $%-14.2f%n", getEmpName(), getEmpID(), getTotalPiecesFinished(), getRatePerPiece());
    
       
      }
      public void displayPieceEmployees_2() {
        System.out.printf("%-20s %-15s %-15s %-15s%n", "Name", "ID", "Pieces Made", "Piece Rate");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s%n", getEmpName(), getEmpID(), "N/A", "N/A");
      }



    @Override
    public String toString() {
        return "Pieces Finished: " + totalPiecesFinished + "\n"+"Rate Per Piece: " + ratePerPiece + "\n" + "Employee Name: " + empName + "\n" + 
        "Employee ID: " + empID +"\n" + "Salary: " + computeSalary() + "\n";
    }
}
