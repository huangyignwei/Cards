package com.luckycloud.cards.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import com.luckycloud.cards.enums.ResultEnum;

/**
 *@Author: yw
 *@Desciption: 返回工具类
 *@Date:11:00 2018/5/24
 *@param:No such property: code for class: Script1
 */
public class ResultUtil {
    public  static <T> Result<T> success(T t){
        Result<T> res = new Result<T>();
        res.setMsg(ResultEnum.SUCCESS.getMessage());
        res.setCode(ResultEnum.SUCCESS.getCode());
        res.setData(t);
        return res;
    }

    public static Result success() {
        Result res = new Result();
        res.setMsg(ResultEnum.SUCCESS.getMessage());
        res.setCode(ResultEnum.SUCCESS.getCode());
        return res;
    }
    public static  Result success(PageInfo info){
        Result result = success(info.getList());
        result.setCount(info.getTotal());
        result.setPages(info.getPages());
        return result;
    }

    public static  Result success(IPage info){
        Result result = success(info.getRecords());
        result.setCount(info.getTotal());
        result.setPages(Integer.valueOf(info.getPages()+""));
        return result;
    }



    public static Result error(String code,String msg){
        Result res=new Result();
        res.setMsg(msg);
        res.setCode(code);
        return res;
    }

    public static  Result error(ResultEnum msg){
        Result res=new Result();
        res.setMsg(msg.getMessage());
        res.setCode(msg.getCode());
        return res;
    }


}
