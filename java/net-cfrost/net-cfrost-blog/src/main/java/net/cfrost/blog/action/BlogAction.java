package net.cfrost.blog.action;

import com.opensymphony.xwork2.ActionSupport;

public class BlogAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {
        System.out.println("!!!!in!!!");
        return SUCCESS;
    }
}
