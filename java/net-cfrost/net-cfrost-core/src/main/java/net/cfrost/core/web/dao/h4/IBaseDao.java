package net.cfrost.core.web.dao.h4;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import net.cfrost.core.web.domain.BaseEntity;

public interface IBaseDao<T extends BaseEntity<?>>{

    T get(Class<T> entityClazz, Serializable id);
    
    Serializable save(T entity);
    
    void update(T entity);
    
    Serializable saveOrUpdate(T entity);
    
    void delete(T entity);
    
    void delete(Class<T> entityClazz, Serializable id);
    
    List<T> findAll(Class<T> entityClazz);
    
    long findCount(Class<T> entityClazz);
    
    List<T> findBy(Criteria criteria);
    
    List<T> findPageBy(Criteria criteria, int pageIndex, int pageSize);
}
