/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieGame.exceptions;

/**
 *
 * @author Boyd
 */
public class StringInputException extends Exception{

    public StringInputException() {
    }

    public StringInputException(String message) {
        super(message);
    }

    public StringInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringInputException(Throwable cause) {
        super(cause);
    }

    public StringInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
    
}
