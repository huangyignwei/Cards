package com.luckycloud.cards.enums;

public enum ResultEnum {
    SUCCESS("0","成功"),
    IS_NULL("10001","参数校验失败"),
    UNKNOWN_EXCEPTION("10002","未知异常"),;


    private String message;
    private String code ;

    ResultEnum(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
