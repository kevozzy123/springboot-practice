package com.pan.myfriendsapp.core.exception;

public class AbstractServerException extends RuntimeException {

    private final int status;

    public AbstractServerException(int status, String message) {
        super(message);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
