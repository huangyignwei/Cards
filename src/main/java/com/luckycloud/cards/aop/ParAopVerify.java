package com.luckycloud.cards.aop;
import com.luckycloud.cards.enums.ResultEnum;
import com.luckycloud.cards.exception.VerifyException;
import com.luckycloud.tools.ValidatorUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName ParAopVerify
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午2:55
 **/
@Aspect
@Component
public class ParAopVerify {

    @Pointcut("execution(  * com.luckycloud.cards.controller.*.*(..))")
    public void annotaionPiont() {}


    @Before("annotaionPiont()")
    public  void log(JoinPoint joinPoint) throws Exception {


        String s = new ValidatorUtils().requestParVerify(joinPoint);

        System.out.println("123123123==>>> 开启aop 参数脚");
        if(s!=null && s.length()>=0){
            throw  new VerifyException(ResultEnum.SUCCESS.IS_NULL.getCode(),s);
        }


    }

}
