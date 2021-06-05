package org.example.atm.client.exception;

public class ATMInternalErrorException extends RuntimeException{
    public ATMInternalErrorException() {
    }

    public ATMInternalErrorException(String message) {
        super(message);
    }

    public ATMInternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ATMInternalErrorException(Throwable cause) {
        super(cause);
    }

    public ATMInternalErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
