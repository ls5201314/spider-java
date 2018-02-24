package com.matai.enums;

public enum ErrorInfo {

    E_1004(1004, "系统内部异常", "ClassCastException"),
    E_1005(1005, "系统内部异常", "ClassNotFoundException"),
    E_1008(1008, "系统内部异常", "Exception"),
    E_1014(1014, "系统内部异常", "IndexOutOfBoundsException"),
    E_1018(1018, "系统内部异常", "NoSuchFieldException"),
    E_1019(1019, "系统内部异常", "NoSuchMethodException"),
    E_1020(1020, "系统内部异常", "NullPointerException"),
    E_1021(1021, "系统内部异常", "NumberFormatException"),
    E_2003(2003, "系统内部异常", "FileNotFoundException"),
    E_2007(2007, "系统内部异常", "IOException"),

    E_9001(9001, "{0}不能为空", "参数为空"),
    E_9002(9002, "{0}不能超过{1}个字符", "参数长度超过最大限制"),
    E_9003(9003, "{0}不能低于{1}个字符", "参数长度低于最小限制"),
    E_9004(9004, "{0}含有非法字符{1}", "参数中含有非法字符"),
    E_9005(9005, "{0}格式错误", "参数格式错误"),
    E_9006(9006, "{0}不存在", "对象不存在"),
    E_9007(9007, "{0}已存在", "对象已存在"),
    E_9008(9008, "{0}已删除", "对象已删除"),
    E_9020(9020, "保存文件{0}失败", "保存文件时出现异常"),
    E_9021(9021, "操作失败", "操作时出现异常"),

    E_0(0, "{0}", "Exception");

    private Integer code;
    private String message;
    private String cause;

    private ErrorInfo(Integer code, String message, String cause) {
        this.code = code;
        this.message = message;
        this.cause = cause;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return code + ": " + message;
    }
}
