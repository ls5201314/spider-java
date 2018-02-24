package com.matai.exception;

import com.matai.enums.ErrorInfo;

import java.text.MessageFormat;
import java.util.Objects;

public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ErrorInfo info = ErrorInfo.E_0;

    private Object[] param;

    public GlobalException() {
        super();
    }

    public GlobalException(String... message) {
        super();
        this.param = message;
    }

    public GlobalException(ErrorInfo info, Object... param) {
        super();
        this.info = info;
        this.param = param;
    }

    public GlobalException(Exception e, ErrorInfo info, Object... param) {
        super(e);
        this.info = info;
        this.param = param;
    }

    public ErrorInfo getInfo() {
        return info;
    }

    public void setInfo(ErrorInfo info) {
        this.info = info;
    }

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object[] param) {
        this.param = param;
    }

    @Override
    public String getMessage() {
        String message = info.getMessage();
        if (Objects.nonNull(param)) {
            message = MessageFormat.format(message, param);
        }
        return message;
    }
}
