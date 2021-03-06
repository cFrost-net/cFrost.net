package net.cfrost.web.core.action;

import java.util.Map;


@SuppressWarnings("serial")
public class ForwardAction extends BaseAction {

    public String execute() throws Exception {
        Map<String,Object> request = (Map) this.getActionContext().get("request"); 
        request.put("requestURL", this.getRequest().getRequestURL()); 
        request.put("requestURI", this.getRequest().getRequestURI()); 
        request.put("chinese", "中文测试"); 
        return SUCCESS;
    }
}
