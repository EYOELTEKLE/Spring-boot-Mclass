package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.ZonedDateTime;

public class ExceptionHandler {
    public ResponseEntity<Object> handleApiException(ApiRequestException e
    )
    {
        ApiException apiException = new ApiException(e.getMessage(),e,HttpStatus.BAD_REQUEST, ZonedDateTime.now());
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }
}
