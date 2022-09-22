package com.uade.morfando.model;

public class SpringErrorPayload {
    public long timestamp;
    public int status;
    public String error;
    public String exception;
    public String message;
    public String path;

    public SpringErrorPayload(long timestamp, int status, String error, String exception, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.exception = exception;
        this.message = message;
        this.path = path;
    }

    //removed getters and setters
}
