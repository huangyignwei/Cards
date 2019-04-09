package com.luckycloud.cards.server.intf;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BaseService
 * @Desc TOO
 * @Author Gavin
 * @Date 2018/11/27 下午3:36
 **/
public interface BaseService<T> {

    int insert(T var1);

    int deleteById(Serializable var1);

    int deleteByMap( Map<String, Object> var1);

    int delete( Wrapper<T> var1);

    int deleteBatchIds( Collection<? extends Serializable> var1);

    int updateById( T var1);

    int update( T var1,  Wrapper<T> var2);

    T selectById(Serializable var1);

    List<T> selectBatchIds( Collection<? extends Serializable> var1);

    List<T> selectByMap(Map<String, Object> var1);

    T selectOne( Wrapper<T> var1);

    Integer selectCount(Wrapper<T> var1);

    /**
     * 使用方法:
     *       ①:以name 条件
     *         QueryWrapper q = new QueryWrapper();
     *           q.eq("user_name","小三1");
     * @param var1
     * @return
     */
    List<T> selectList(Wrapper<T> var1);

    List<Map<String, Object>> selectMaps(Wrapper<T> var1);

    List<Object> selectObjs(Wrapper<T> var1);

    /**
     *@Author:Gavin
     *@Desc:使用 方法
     *        条件的构建
     *        QueryWrapper q = new QueryWrapper();
     *        q.eq("user_name","小三");
     *        分页构建
     *        Page page =new Page();
     *        page.setPages(1L);
     *        page.setTotal(10L);
     *@Date:
     *@param:
     **/
    IPage<T> selectPage(IPage<T> var1, Wrapper<T> var2);

    IPage<Map<String, Object>> selectMapsPage(IPage<T> var1, Wrapper<T> var2);
}
