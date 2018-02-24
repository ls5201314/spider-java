package com.matai.dto;

import com.matai.enums.ErrorInfo;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Objects;

public class ErrorResponseDto extends HttpResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private ErrorInfo errorInfo;

    private Object[] param;

    public ErrorResponseDto(ErrorInfo errorInfo, Object... param) {
        super(HttpStatus.BAD_REQUEST);
        this.errorInfo = errorInfo;
        this.param = param;
    }

    public ErrorResponseDto(HttpStatus httpStatus, ErrorInfo errorInfo, Object... param) {
        super(httpStatus);
        this.errorInfo = errorInfo;
        this.param = param;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object... param) {
        this.param = param;
    }

    @Override
    public String getMessage() {
        String message = errorInfo.toString();
        if (Objects.nonNull(param)) {
            message = MessageFormat.format(message, param);
        }
        return message;
    }
}
