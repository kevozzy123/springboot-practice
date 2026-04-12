package com.pan.myfriendsapp.core.exception;

import com.pan.myfriendsapp.core.data.ApiResponse;
import com.pan.myfriendsapp.core.data.ResponseError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AbstractServerException.class)
    public ApiResponse<Void> handleException(AbstractServerException e) {
        ApiResponse<Void> response = new ApiResponse<>();
        response.setError(new ResponseError(e.getStatus(), e.getMessage(), e.toString()));
        return response;
    }

    @ExceptionHandler(AbstractClientException.class)
    public ApiResponse<Void> handleException(AbstractClientException e) {
        ApiResponse<Void> response = new ApiResponse<>();
        response.setError(new ResponseError(e.getStatus(), e.getMessage(), e.toString()));
        return response;
    }

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse<Void> handleException(RuntimeException e) {
        ApiResponse<Void> response = new ApiResponse<>();
        response.setError(new ResponseError(
                500,
                "Internal Server Error",
                e.getMessage()
        ));
        return response;
    }

}
