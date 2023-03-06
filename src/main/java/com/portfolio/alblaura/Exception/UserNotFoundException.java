package com.portfolio.alblaura.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mensaje) {
        super(mensaje);
    }
}
