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

    @Override
    public String toString() {
        return "Pieces Finished: " + totalPiecesFinished + "\n"+"Rate Per Piece: " + ratePerPiece + "\n" + "Employee Name: " + empName + "\n" + 
        "Employee ID: " + empID +"\n" + "Salary: " + computeSalary() + "\n";
    }
}
