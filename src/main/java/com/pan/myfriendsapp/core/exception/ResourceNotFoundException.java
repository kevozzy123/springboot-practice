package com.pan.myfriendsapp.core.exception;

public class ResourceNotFoundException extends AbstractClientException {

    public ResourceNotFoundException(String message) {
        super(404, "Specified resource doesn't exist: " + message);
    }

    public ResourceNotFoundException() {
        super(404, "Specified resource doesn't exist.");
    }
}
