package com.luckycloud.cards.server.intf;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luckycloud.cards.model.BaseModel;
import com.luckycloud.cards.model.Tb_Admin_Account;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName AdminAccountServer
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午3:30
 **/
public interface AdminAccountService<T extends BaseModel> extends  BaseService<Tb_Admin_Account> {


    ///测试分页
    IPage<Tb_Admin_Account> findPageAll(Page page, @Param("tbAdminAccount") Tb_Admin_Account state);
}
