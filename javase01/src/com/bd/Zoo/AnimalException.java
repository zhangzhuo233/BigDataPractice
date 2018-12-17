package com.bd.Zoo;

public class AnimalException extends RuntimeException{
    public AnimalException() {
    }

    public AnimalException(String message) {
        super(message);
    }

    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalException(Throwable cause) {
        super(cause);
    }

    public AnimalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
