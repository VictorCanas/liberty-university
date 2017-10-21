/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */

//pieceWorke represents an employee whose pay is based on 
//the number of pieces of merchandise produced. 
public class PieceWorker extends Employee {

    private double wage; // store the employee’s wage per piece		
    private int pieces; //store the number of pieces produced

    public PieceWorker(String firstName, 
            String lastName, 
            String socialSecurityNumber, 
            double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        setPieces(pieces);
        setWage(wage);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    // multiplying the number of pieces produced by the wage per piece
    public double earnings() {
        return pieces * wage;
    }
             
    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "wage", getWage(), "pieces", getPieces());
    }
}

