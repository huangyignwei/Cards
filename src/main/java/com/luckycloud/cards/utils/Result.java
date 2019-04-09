package com.luckycloud.cards.utils;

import lombok.Data;

/**
 * @ClassName Result
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午4:09
 **/
@Data
public class Result<T> {
    //提示信息
    private String msg;
    //提示码
    private String code ;
    ///内容
    private T data;
    //总条数 只适用于layui
    private  Long count;
    ///总页数
    private Integer pages;
}
