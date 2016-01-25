package net.cfrost.web.module.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.cfrost.web.core.domain.BaseEntity;

@SuppressWarnings("serial")
@Entity
@Table(name="blog")
public class Blog extends BaseEntity<Blog> {  
    @Column
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
