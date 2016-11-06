package com.qin.qinxq.mvc.basemvc.dao.daoImp;

import com.qin.qinxq.global.Config;
import com.qin.qinxq.mvc.basemvc.dao.BaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by qinxq on 2016/11/5 22:33
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public int delete(T entity) {
        return sqlSessionTemplate.delete(getSqlName("delete"),entity);
    }

    public List<T> queryAll() {
        return sqlSessionTemplate.selectList("queryAll");
    }

    /**
     * @Description 辅助方法，获取dao方法对应的mybatis方法全名
     * @Param sqlName
     * @Return String
     */
    private String getSqlName(String sqlName){
        return getClassName()+ Config.MYABTIS_SPLITOR+sqlName;
    }

    /**
     * @Description 获取当前泛型的类名
     * @Return String
     */
    private Class<T> clazz;
    private String getClassName(){
        Type type=this.getClass().getGenericSuperclass();
        if(type instanceof ParameterizedType){
            clazz=(Class<T>) ((ParameterizedType)type).getActualTypeArguments()[0];
        }
        return clazz.toString();
    }
}
