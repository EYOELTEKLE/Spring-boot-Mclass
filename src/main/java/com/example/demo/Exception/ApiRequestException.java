package com.example.demo.Exception;

public class ApiRequestException extends RuntimeException {
    public ApiRequestException(String s) {
        super(s);
    }
    public ApiRequestException(String s, Throwable cause)
    {
        super(s,cause);
    }
}
