/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculator;

/**
 *
 * @author NurHidayati
 */
public class NegativeValueException extends Exception {

    /**
     * Creates a new instance of <code>NegativeValueException</code> without
     * detail message.
     */
    public NegativeValueException() {
    }

    /**
     * Constructs an instance of <code>NegativeValueException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeValueException(String msg) {
        super("Please insert positive number only");
    }
    
    public String getMessage(){
        return "Please insert positive number only";
    }
}
