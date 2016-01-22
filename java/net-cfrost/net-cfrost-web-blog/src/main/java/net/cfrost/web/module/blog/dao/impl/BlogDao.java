package net.cfrost.web.module.blog.dao.impl;

import net.cfrost.web.core.dao.hibernate5.impl.BaseDao;
import net.cfrost.web.module.blog.dao.IBlogDao;
import net.cfrost.web.module.blog.domain.Blog;

public class BlogDao extends BaseDao<Blog> implements IBlogDao {

    public static void main(String[] args){
        BlogDao b = new BlogDao();
        System.out.println(b.entityClass);
    }
}
