package net.cfrost.web.core.dao.hibernate5.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import net.cfrost.web.core.dao.hibernate5.IBaseDao;
import net.cfrost.web.core.domain.BaseEntity;

public abstract class BaseDao<T extends BaseEntity<?>> implements IBaseDao<T> {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected final Class<T> entityClass;

    public BaseDao(){
        this.entityClass = this.getInitEntityClass();
    }

    private Class<T> getInitEntityClass() {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType pType = (ParameterizedType)type;
        Type argType = pType.getActualTypeArguments()[0];
        if (argType instanceof Class) {
            return ((Class) argType);
        }
        return null;
    }

    @Override
    public T get(Serializable id) {
        return this.getSessionFactory().getCurrentSession().get(this.entityClass, id);
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
    public void delete(Serializable id) {
        this.getSessionFactory().getCurrentSession()
            .createQuery("delete "+ this.entityClass.getSimpleName() + " en where en.id = ?0")
            .setParameter(0, id)
            .executeUpdate();
    }

    @Override
    public List<T> findAll() {
        return this.find("select en from "+ this.entityClass.getSimpleName() + " en");
    }

    @Override
    public long findCount() {
        List<?> l = this.find("select count(*) from "+ this.entityClass.getSimpleName());

        if(l!=null && l.size() == 1)
            return (Long)l.get(0);
        return 0;
    }


    protected List<T> find(String hql){
        return this.getSessionFactory().getCurrentSession().createQuery(hql).list();
    }


    protected List<T> find(String hql, Object... params){
        Query query = this.getSessionFactory().getCurrentSession().createQuery(hql);

        for(int i = 0; i < params.length; i++){
            query.setParameter(i, params[i]);
        }

        return query.list();
    }


    @Override
    public List<T> findBy(DetachedCriteria detachedCriteria) {
        return detachedCriteria.getExecutableCriteria(this.getSessionFactory().getCurrentSession()).list();
        //return criteria.list();
    }

    @Override
    public List<T> findPageBy(DetachedCriteria detachedCriteria, int pageIndex, int pageSize) {
        Criteria criteria = detachedCriteria.getExecutableCriteria(this.getSessionFactory().getCurrentSession());
        criteria.setFirstResult(pageIndex);
        criteria.setMaxResults(pageSize);
        return criteria.list();
    }
}
