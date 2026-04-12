package com.pan.myfriendsapp.core.data;

public class ApiResponse<T> {
    private T data;
    private ResponseError error;

    public ApiResponse() {
    }

    public ApiResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseError getError() {
        return error;
    }

    public void setError(ResponseError error) {
        this.error = error;
    }
}