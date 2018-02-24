package com.matai.dto;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class HttpResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private HttpStatus httpStatus;

    private String message;

    private Object data;


    public HttpResponseDto(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpResponseDto(HttpStatus httpStatus, String message, Object data) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getHttpStatus() {
        if (null == httpStatus) {
            return HttpStatus.BAD_REQUEST;
        }
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
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
