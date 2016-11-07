package com.qin.qinxq.mvc.basemvc.dao;

import java.util.List;

/**
 * Created by qinxq on 2016/11/5 22:31
 */
public interface BaseDao<T> {
    int delete(T entity);
    List<T> queryAll();
    int update(T entity);
    List<T> select(T entity);
    T selectOne(T entity);
    int insert(T entity);
}
