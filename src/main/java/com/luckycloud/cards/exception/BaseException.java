package com.luckycloud.cards.exception;

import com.luckycloud.cards.enums.ResultEnum;

/**
 * @ClassName BaseException
 * @Desc 异常基类
 * @Author Gavin
 * @Date 2018/11/27 下午4:14
 **/
public class BaseException extends RuntimeException {

    public BaseException(){};
    public BaseException(String code , String msg){
        super(msg);
        this.code=code;
        this.msg=msg;
    };
    public BaseException(ResultEnum msg){
        super(msg.getMessage());
        this.code=msg.getCode();
        this.msg=msg.getMessage();
    }
    //提示信息
    private String msg;
    //提示码
    private String code ;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
