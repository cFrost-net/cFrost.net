package net.cfrost.web.module.blog.service.impl;

import net.cfrost.web.module.blog.dao.IBlogDao;
import net.cfrost.web.module.blog.dao.Test;
import net.cfrost.web.module.blog.service.IBlogService;

public class BlogService implements IBlogService {

    private IBlogDao blogDao;
    @Override
    public void ShowText() {
        Test test = new Test();
        test.test();
    }

}
