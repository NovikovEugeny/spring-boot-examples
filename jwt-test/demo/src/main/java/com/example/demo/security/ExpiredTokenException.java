package com.example.demo.security;

public class ExpiredTokenException extends Exception {

    public ExpiredTokenException() {
    }

    public ExpiredTokenException(String message) {
        super(message);
    }

    public ExpiredTokenException(String message, Exception exc) {
        super(message, exc);
    }

    public ExpiredTokenException(Exception exc) {
        super(exc);
    }
}
