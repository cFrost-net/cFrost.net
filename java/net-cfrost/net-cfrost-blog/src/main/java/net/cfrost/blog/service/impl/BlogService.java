package net.cfrost.blog.service.impl;

import net.cfrost.blog.dao.Test;
import net.cfrost.blog.service.IBlogService;

public class BlogService implements IBlogService {

    @Override
    public void ShowText() {
        Test test = new Test();
        test.test();
    }

}
