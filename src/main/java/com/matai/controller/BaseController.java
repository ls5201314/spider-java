package com.matai.controller;

import com.github.pagehelper.Page;
import com.matai.dto.ErrorResponseDto;
import com.matai.dto.HttpResponseDto;
import com.matai.enums.ErrorInfo;
import com.matai.exception.GlobalException;
import com.matai.pager.Paged;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BaseController {

    private Logger logger = Logger.getLogger(BaseController.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> exceptHandle(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        logger.error("except handle:", e);
        ErrorResponseDto error = new ErrorResponseDto(ErrorInfo.E_1008);
        if (e instanceof GlobalException) {
            error.setErrorInfo(((GlobalException) e).getInfo());
            error.setParam(((GlobalException) e).getParam());
        } else if (e instanceof MissingServletRequestParameterException) {
            error.setErrorInfo(ErrorInfo.E_9001);
            error.setParam(((MissingServletRequestParameterException) e).getParameterName());
        }  else if (e instanceof ClassCastException) {
            error.setErrorInfo(ErrorInfo.E_1004);
        } else if (e instanceof ClassNotFoundException) {
            error.setErrorInfo(ErrorInfo.E_1005);
        } else if (e instanceof IndexOutOfBoundsException) {
            error.setErrorInfo(ErrorInfo.E_1014);
        } else if (e instanceof NoSuchFieldException) {
            error.setErrorInfo(ErrorInfo.E_1018);
        } else if (e instanceof NoSuchMethodException) {
            error.setErrorInfo(ErrorInfo.E_1019);
        } else if (e instanceof NullPointerException) {
            error.setErrorInfo(ErrorInfo.E_1020);
        } else if (e instanceof NumberFormatException) {
            error.setErrorInfo(ErrorInfo.E_1021);
        } else if (e instanceof FileNotFoundException) {
            error.setErrorInfo(ErrorInfo.E_2003);
        } else if (e instanceof IOException) {
            error.setErrorInfo(ErrorInfo.E_2007);
        }
        return getResponseEntity(error);
    }

    protected ResponseEntity<?> success() {
        return getResponseEntity(new HttpResponseDto(HttpStatus.OK, "操作成功", null));
    }

    protected ResponseEntity<?> success(Object data) {
        return getResponseEntity(new HttpResponseDto(HttpStatus.OK, "操作成功", data));
    }

    protected ResponseEntity<?> notFound(String msg) {
        if (msg == null) {
            msg = "没有发现记录";
        }
        return getResponseEntity(new HttpResponseDto(HttpStatus.NOT_FOUND, msg, null));
    }

    protected ResponseEntity<?> error(HttpStatus statusCode, ErrorInfo info, Object... param) {
        return getResponseEntity(new ErrorResponseDto(statusCode, info, param));
    }

    protected ResponseEntity<?> error(ErrorInfo info, Object... param) {
        return getResponseEntity(new ErrorResponseDto(info, param));
    }

    protected ResponseEntity<?> error(GlobalException e) {
        return getResponseEntity(new ErrorResponseDto(e.getInfo(), e.getParam()));
    }

    private ResponseEntity<?> getResponseEntity(HttpResponseDto response) {
        HttpStatus code = response.getHttpStatus();
        Object data = response.getData();

        Map<String, Object> map = new HashMap<>();
        map.put("code", code.value());
        map.put("message", response.getMessage());
        if (data instanceof Page) {
            data = new Paged((Page) data);
        }
        if (Objects.nonNull(data)) {
            map.put("data", data);
        }

        return new ResponseEntity(map, code);
    }

}
