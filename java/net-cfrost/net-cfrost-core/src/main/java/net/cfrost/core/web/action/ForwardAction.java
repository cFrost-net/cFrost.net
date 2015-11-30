package net.cfrost.core.web.action;

import com.opensymphony.xwork2.ActionSupport;
import net.cfrost.security.Authenticate;

public class ForwardAction extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String execute() throws Exception {
        System.out.println("ForwardAction--longinCheck");
        if(Authenticate.longinCheck())
            return SUCCESS;
        else
            return ERROR;
    }
}
