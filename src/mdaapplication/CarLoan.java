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
public class CarLoan extends Loan {
    private String carName;

    public CarLoan() {
    }

    public CarLoan(String carName) {
        this.carName = carName;
    }

    public CarLoan(String carName, double annualInterestRate, int numberOfYears, double loanAmount) {
        super(annualInterestRate, numberOfYears, loanAmount);
        this.carName = carName;
    }
    
    public String getCarName(){
        return carName;
    }
    
    public void setCarName(String carName){
        this.carName=carName;
    }
}
