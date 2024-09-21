package com.employeeseries.version2;

public class Piece extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;

    public Piece() {}
    public Piece(Employee e) {
        super(e.getName(), e.getId());
    }
    public Piece(Employee e, String name, int id) {
        super(name,id);
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
}
