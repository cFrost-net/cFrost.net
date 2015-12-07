package net.cfrost.core.web.dao.h4.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import net.cfrost.core.web.dao.h4.IBaseDao;
import net.cfrost.core.web.domain.BaseEntity;

public class BaseDao<T extends BaseEntity<?>> implements IBaseDao<T> {
    
    private SessionFactory sessionFactory;    

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T get(Class<T> entityClazz, Serializable id) {
        return this.getSessionFactory().getCurrentSession().get(entityClazz, id);
    }

    @Override
    public Serializable save(T entity) {
        return this.getSessionFactory().getCurrentSession().save(entity);
    }

    @Override
    public void update(T entity) {
        this.getSessionFactory().getCurrentSession().update(entity);
        
    }

    @Override
    public Serializable saveOrUpdate(T entity) {
        if(entity.getId() != null){
            this.update(entity);
            return entity.getId();
        } else {
            return this.save(entity);
        }
    }

    @Override
    public void delete(T entity) {
        this.getSessionFactory().getCurrentSession().delete(entity);
    }

    @Override
    public void delete(Class<T> entityClazz, Serializable id) {
        this.getSessionFactory().getCurrentSession()
            .createQuery("delete "+ entityClazz.getSimpleName() + " en where en.id = ?0")
            .setParameter(0, id)
            .executeUpdate();
    }

    @Override
    public List<T> findAll(Class<T> entityClazz) {
        return this.find("select en from "+ entityClazz.getSimpleName() + " en");
    }

    @Override
    public long findCount(Class<T> entityClazz) {
        List<?> l = this.find("select count(*) from "+ entityClazz.getSimpleName());
        
        if(l!=null && l.size() == 1)
            return (Long)l.get(0);
        return 0;
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql){
        return this.getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql, Object... params){
        Query query = this.getSessionFactory().getCurrentSession().createQuery(hql);
        
        for(int i = 0; i < params.length; i++){
            query.setParameter(i, params[i]);
        }
        
        return query.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findBy(Criteria criteria) {
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findPageBy(Criteria criteria, int pageIndex, int pageSize) {
        criteria.setFirstResult(pageIndex);
        criteria.setMaxResults(pageSize);
        return criteria.list();
    }

}
