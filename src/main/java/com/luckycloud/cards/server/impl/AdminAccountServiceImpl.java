package com.luckycloud.cards.server.impl;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luckycloud.cards.dao.AdminAccountDao;
import com.luckycloud.cards.model.Tb_Admin_Account;
import com.luckycloud.cards.server.intf.AdminAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AdminAccountServerImpl
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午3:32
 **/
@Service
public class AdminAccountServiceImpl implements AdminAccountService<Tb_Admin_Account> {

    @Autowired
    private AdminAccountDao adminAccountDao;


    @Override
    public int insert(Tb_Admin_Account var1) {
        return adminAccountDao.insert(var1);
    }

    @Override
    public int deleteById(Serializable var1) {
        return adminAccountDao.deleteById(var1);
    }

    @Override
    public int deleteByMap(Map<String, Object> var1) {
        return adminAccountDao.deleteByMap(var1);
    }

    @Override
    public int delete(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.delete(var1);
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> var1) {
        return adminAccountDao.deleteBatchIds(var1);
    }

    @Override
    public int updateById(Tb_Admin_Account var1) {
        return adminAccountDao.updateById(var1);
    }

    @Override
    public int update(Tb_Admin_Account var1, Wrapper<Tb_Admin_Account> var2) {
        return adminAccountDao.update(var1,var2);
    }

    @Override
    public Tb_Admin_Account selectById(Serializable var1) {
        return adminAccountDao.findById(1);
    }

    @Override
    public List<Tb_Admin_Account> selectBatchIds(Collection<? extends Serializable> var1) {
        return adminAccountDao.selectBatchIds(var1);
    }

    @Override
    public List<Tb_Admin_Account> selectByMap(Map<String, Object> var1) {
        return adminAccountDao.selectByMap(var1);
    }

    @Override
    public Tb_Admin_Account selectOne(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.selectOne(var1);
    }

    @Override
    public Integer selectCount(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.selectCount(var1);
    }

    @Override
    public List<Tb_Admin_Account> selectList(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.selectList(var1);
    }

    @Override
    public List<Map<String, Object>> selectMaps(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.selectMaps(var1);
    }

    @Override
    public List<Object> selectObjs(Wrapper<Tb_Admin_Account> var1) {
        return adminAccountDao.selectObjs(var1);
    }

    @Override
    public IPage<Tb_Admin_Account> selectPage(IPage<Tb_Admin_Account> var1, Wrapper<Tb_Admin_Account> var2) {
        return adminAccountDao.selectPage(var1,var2);
    }

    @Override
    public IPage<Map<String, Object>> selectMapsPage(IPage<Tb_Admin_Account> var1, Wrapper<Tb_Admin_Account> var2) {
        return adminAccountDao.selectMapsPage(var1,var2);
    }

    @Override
    public IPage<Tb_Admin_Account> findPageAll(Page page, Tb_Admin_Account state) {
        return adminAccountDao.findPageAll(page,state);
    }
}
