package net.cfrost.web.module.blog.dao;

import net.cfrost.web.module.blog.domain.Blog;
import net.cfrost.web.module.blog.domain.XBlog;

public class Test {
    public void test() {
        Blog blog = new Blog();
        XBlog blog2 = new XBlog();
        System.out.println(blog.compareTo(blog2));
        
    }
}
