/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdaapplication;

/**
 *
 * @author NurHidayati
 */
public class MilesKilo implements Calculate{

    private double miles;
    private double kilo;

    public MilesKilo() {
    }

    public MilesKilo(double miles, double kilo) {
        this.miles = miles;
        this.kilo = kilo;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }
    
    @Override
    public double calculate(){
        
        kilo = miles * 1.609;
        
        return kilo;
    }
}
