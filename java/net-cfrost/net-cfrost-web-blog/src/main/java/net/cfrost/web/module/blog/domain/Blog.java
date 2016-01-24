package net.cfrost.web.module.blog.domain;

import net.cfrost.web.core.domain.BaseEntity;

@SuppressWarnings("serial")
public class Blog extends BaseEntity<Blog> {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
