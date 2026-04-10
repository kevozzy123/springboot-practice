package com.pan.myfriendsapp.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleException(RuntimeException e) {
        return ResponseEntity
                .status(determineHttpStatus(e))
                .body(e.getMessage());
    }

    private HttpStatusCode determineHttpStatus(RuntimeException error) {
        if (error instanceof ResponseStatusException) {
            return ((ResponseStatusException) error).getStatusCode();
        } else if (error instanceof ResourceNotFoundException) {
            return HttpStatus.NOT_FOUND;
        } else {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }

}
