/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uiowa.exception;

/**
 *
 * @author Hiep
 */
public class InvalidCodeFormatException extends RuntimeException {

    public InvalidCodeFormatException() {
    }

    public InvalidCodeFormatException(String message) {
        super(message);
    }

    public InvalidCodeFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCodeFormatException(Throwable cause) {
        super(cause);
    }

    public InvalidCodeFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
