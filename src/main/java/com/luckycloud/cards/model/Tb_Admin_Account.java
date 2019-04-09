package com.luckycloud.cards.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/**
 * @ClassName Tb_Admin_Account
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午3:22
 **/
@Data
@Alias("tbAdminAccount")
@TableName("Tb_Admin_Account")
public class Tb_Admin_Account  extends  BaseModel{
    private Integer status;
    private Timestamp open_date;
    private String password;
    private String account_id;
    private String agent_id;
    private String user_name;
    private int role_id;
    private int if_online;
}
