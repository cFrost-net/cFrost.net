package net.cfrost.blog.dao;

import net.cfrost.blog.domain.Blog;

public class Test {
    public void test() {
        Blog blog = new Blog();
        Blog blog2 = new Blog();
        System.out.println(blog.compareTo(blog2));
    }
}
