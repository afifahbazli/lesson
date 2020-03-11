/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdaapplication;

/**
 *
 * @author user
 */
public class HomeLoan extends Loan {
    private String typeOfHome;

    public HomeLoan() {
    }

    public HomeLoan(String typeOfHome) {
        this.typeOfHome = typeOfHome;
    }

    public HomeLoan(String typeOfHome, double annualInterestRate, int numberOfYears, double loanAmount) {
        super(annualInterestRate, numberOfYears, loanAmount);
        this.typeOfHome = typeOfHome;
    }
    
    public String getTypeOfHome(){
        return typeOfHome;
    }
    
    public void setTypeOfHome(String typeOfHome){
        this.typeOfHome=typeOfHome;
    }
}
