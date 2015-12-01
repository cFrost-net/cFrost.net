package net.cfrost.blog.action;

import net.cfrost.blog.service.IBlogService;

import com.opensymphony.xwork2.ActionSupport;

public class BlogAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private IBlogService blogService;

    public void setBlogService(IBlogService blogService) {
        this.blogService = blogService;
    }

    public String test() throws Exception {
        this.blogService.ShowText();
        return SUCCESS;
    }
}
