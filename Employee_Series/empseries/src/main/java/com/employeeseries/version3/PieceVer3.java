package com.employeeseries.version3;


public class PieceVer3 extends EmployeeVer3{
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceVer3() {
    }

    public PieceVer3(Name name, int id) {
        super(name.getFullName(), id);
    }

    public PieceVer3(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceVer3(EmployeeVer3 e, int totalPiecesFinished, double ratePerPiece) {
        super(e.empName.getFullName(),e.dateHired.getFullDate(),e.birthDate.getFullDate(), e.getId());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceVer3(int totalPiecesFinished, double ratePerPiece, Name name, int id) {
        super(name.getFullName(), id);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
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

    public void displayPieceEmployees() {
        System.out.println("Piece Employee: " + toString() + "Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Total Peices Finished: " + totalPiecesFinished + "\n"
        + "Rate per Piece: " + ratePerPiece + "\n";
    }
}
