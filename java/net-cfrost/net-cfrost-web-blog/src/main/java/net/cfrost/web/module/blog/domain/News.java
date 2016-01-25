package net.cfrost.web.module.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import net.cfrost.web.core.domain.BaseEntity;

@SuppressWarnings("serial")
@Entity
@Table(name="news")
public class News extends BaseEntity<News> {   
    
}
