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
public class InvalidLengthException extends Exception {

    /**
     * Creates a new instance of <code>InvalidLengthException</code> without
     * detail message.
     */
    public InvalidLengthException() {
    }

    /**
     * Constructs an instance of <code>InvalidLengthException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidLengthException(String msg) {
        super(msg);
    }
}
