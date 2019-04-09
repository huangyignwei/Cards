package com.luckycloud.cards.exception;

import com.luckycloud.cards.enums.ResultEnum;

/**
 * @ClassName VerifyException
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午5:33
 **/
public class VerifyException extends BaseException {

    public VerifyException(){};
    public VerifyException(String code , String msg){
        super(code,msg);
    };
    public VerifyException(ResultEnum msg){
        super(msg);
    }
}
