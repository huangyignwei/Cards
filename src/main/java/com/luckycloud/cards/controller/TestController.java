package com.luckycloud.cards.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.EmptyWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luckycloud.annotation.NotEmpty;
import com.luckycloud.annotation.VerifyObjPar;
import com.luckycloud.cards.annotation.InspectionAop;
import com.luckycloud.cards.model.Tb_Admin_Account;
import com.luckycloud.cards.server.intf.AdminAccountService;
import com.luckycloud.cards.utils.Result;
import com.luckycloud.cards.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName TestController
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午3:39
 **/
@Controller
@RequestMapping("/*")
public class TestController extends  BaseController {
   @Autowired
   private AdminAccountService adminAccountService;
   @ResponseBody
   @RequestMapping("/hi")
   public Result find(){

//       Tb_Admin_Account user = new Tb_Admin_Account();
//       user.setUser_name("小三");
//       EmptyWrapper<Tb_Admin_Account> eWrapper = new EmptyWrapper().setEntity(user);



       Page page =new Page();
       page.setPages(1L);
       page.setTotal(10L);

       Tb_Admin_Account user = new Tb_Admin_Account();
       user.setUser_name("小三");

       return ResultUtil.success(  adminAccountService.findPageAll(page,user));
      // return ResultUtil.success( adminAccountService.selectPage(page,q));

   }

   /**
    *
    *@Author:Gavin
    *@Desc:测试 注解 校验参数
    *@Date:
    *@param:name 如果没有name 没有传或者 没有值会报错 而且返回 {"msg":"name,该字段不可以为空","code":"10001","data":null,"count":null,"pages":null}
    **/
    @VerifyObjPar //这个注解必须要 标示开启 aop 校验参数  ,NotEmpty 标示不可以为空
    @ResponseBody
    @RequestMapping("/name")
   public Result testCheck(@NotEmpty(keyName = "name")  String name){
       return ResultUtil.success(adminAccountService.selectById(1));
   }


   public Result test(){

        return null;
   }


}
