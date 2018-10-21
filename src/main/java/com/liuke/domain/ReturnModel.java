package com.liuke.domain;

public class ReturnModel {
    private int code;
    private String message;
    private Object data;

    ReturnModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ReturnModel(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ReturnModel getInstance(int code, String message) {
        return new ReturnModel(code, message);
    }

    public static ReturnModel getInstance(int code, String message, Object data) {
        return new ReturnModel(code, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
