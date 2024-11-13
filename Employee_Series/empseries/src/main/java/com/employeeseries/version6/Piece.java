package com.employeeseries.version6;

public class Piece extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public Piece() {
    }

    public Piece(Name name, int id) {
        super(name.getFullName(), id);
    }

    public Piece(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(Employee e, int totalPiecesFinished, double ratePerPiece) {
        super(e.empName.getFullName(), e.dateHired.getFullDate(), e.birthDate.getFullDate(), e.getId());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(int totalPiecesFinished, double ratePerPiece, Name name, int id) {
        super(name.getFullName(), id);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    public Piece(Name name, MyDate hire, MyDate dob, int id, int totalPiecesFinished, double ratePerPiece) {
        super(name, id);
        super.setBirthDate(dob);
        super.setDateHired(hire);
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

    @Override  
    public double computeSalary() {
        double salary = 0;
        int bonusPieces = totalPiecesFinished / 100;
        int remainingPieces = totalPiecesFinished % 100;

        salary += (bonusPieces * 100 * ratePerPiece * 10);
        salary += (remainingPieces * ratePerPiece);

        return salary;
    }
    @Override
    public void display() {
        System.out.println("Piece Employee: ");
        super.display();
        System.out.println("Computed Salary: " + computeSalary() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Total Peices Finished: " + totalPiecesFinished + "\n"
                + "Rate per Piece: " + ratePerPiece + "\n";
    }
}
