package com.employeeseries.version2;

public class Piece extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public Piece() {
    }

    public Piece(Employee e) {
        super(e.getName(), e.getId());
    }

    public Piece(Employee e, String name, int id) {
        super(name, id);
    }

    public Piece(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(Employee e, int totalPiecesFinished, double ratePerPiece) {
        super(e.getName(), e.getId());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(Employee e, int totalPiecesFinished, double ratePerPiece, String name, int id) {
        super(name, id);
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

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}