package net.cfrost.core.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class ForwardAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {
        System.out.println("ForwardAction");
        
        return SUCCESS;
    }
}
