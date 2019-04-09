package com.luckycloud.cards.exception;

import com.luckycloud.cards.enums.ResultEnum;
import com.luckycloud.cards.utils.Result;
import com.luckycloud.cards.utils.ResultUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName HandleException
 * @Desc 统一处理异常
 * @Author Gavin
 * @Date 2018/11/27 下午4:17
 **/
@ControllerAdvice
@ResponseBody()
public class HandleException {
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result errorResult(RuntimeException e){
        e.printStackTrace();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        if(e instanceof BaseException){
            BaseException sub=(BaseException)e;
            return ResultUtil.error(sub.getCode(),sub.getMsg());
        }
        return ResultUtil.error(ResultEnum.UNKNOWN_EXCEPTION);
    }
}