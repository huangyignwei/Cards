package com.luckycloud.cards.dao;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luckycloud.cards.model.Tb_Admin_Account;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName AdminAccountDao
 * @Desc:必须继承这个Basedao
 * @Author Gavin
 * @Date 2018/11/27 下午3:21
 **/
public interface AdminAccountDao extends BaseDao<Tb_Admin_Account> {
     ///测试自定义sql
     Tb_Admin_Account  findById(int id);

     /**测试分页
      * <p>
      * 查询 : 根据state状态查询用户列表，分页显示
      * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
      * </p>
      * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
      * @param account 状态
      * @return 分页对象
      * @sql :xml的sql的赋值是   #{tbAdminAccount.user_name}
      */
     IPage<Tb_Admin_Account> findPageAll(Page page, @Param("tbAdminAccount") Tb_Admin_Account account);
}
