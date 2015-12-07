package net.cfrost.blog.dao;

import net.cfrost.blog.domain.Blog;
import net.cfrost.blog.domain.XBlog;

public class Test {
    public void test() {
        Blog blog = new Blog();
        XBlog blog2 = new XBlog();
        System.out.println(blog.compareTo(blog2));
        
    }
}
