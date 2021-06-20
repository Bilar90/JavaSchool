package org.example.atm.server.processing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class PINIncorrectException extends RuntimeException{
    public PINIncorrectException() {
    }

    public PINIncorrectException(String message) {
        super(message);
    }

    public PINIncorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public PINIncorrectException(Throwable cause) {
        super(cause);
    }

    public PINIncorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
