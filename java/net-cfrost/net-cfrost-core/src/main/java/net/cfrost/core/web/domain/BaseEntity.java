package net.cfrost.core.web.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public abstract class BaseEntity<T> implements Serializable, Comparable<T> {
    
    private Long id;
    private Long createBy;
    private Long modifyBy;
    private Date createDate;
    private Date modifyDate;
    private Integer ifDel;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getIfDel() {
        return ifDel;
    }

    public void setIfDel(Integer ifDel) {
        this.ifDel = ifDel;
    }

    @Override 
    public int compareTo(T o) {
        
        if(o == null)
            return 1;
        
        if(!(this.getClass().isAssignableFrom(o.getClass())))
            return 1;
        
        BaseEntity<?> obj = (BaseEntity<?>)o;
        
        if(this.getId() == null)
            return 1;
        
        if(obj.getId() == null)
            return -1;
        
        return this.getId().compareTo(obj.getId());
    }
}
