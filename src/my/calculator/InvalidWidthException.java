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
public class InvalidWidthException extends Exception {

    /**
     * Creates a new instance of <code>InvalidWidthException</code> without
     * detail message.
     */
    public InvalidWidthException() {
    }

    /**
     * Constructs an instance of <code>InvalidWidthException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidWidthException(String msg) {
        super(msg);
    }
}
