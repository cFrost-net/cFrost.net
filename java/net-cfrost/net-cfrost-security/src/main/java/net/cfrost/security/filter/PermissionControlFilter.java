package net.cfrost.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class PermissionControlFilter implements Filter {

    private String[] webFolders;
    
    public void setWebFolder(String webFolder) {
        this.webFolders = webFolder.trim().split(",");
    }
    
    public PermissionControlFilter() {}
    
    public PermissionControlFilter(String webFolder) {
        this.webFolders = webFolder.trim().split(",");
    }

    @Override
    public void init(FilterConfig paramFilterConfig) throws ServletException {
        // TODO Auto-generated method stub
        this.webFolders=paramFilterConfig.getInitParameter("webFolder").split(",");
    }

    @Override
    public void doFilter(ServletRequest paramServletRequest,
            ServletResponse paramServletResponse, FilterChain paramFilterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        String requestURI = ((HttpServletRequest)paramServletRequest).getRequestURI();
        String contextPath = ((HttpServletRequest)paramServletRequest).getContextPath();
        
        //去掉项目名称后的URI
        String realURI = requestURI.replaceFirst(contextPath, "");
        
        //模块名称 /xxx/yyy/zzz中的xxx
        String moduleName = this.findModuleName(realURI);
        
        System.out.println("realURI:"+realURI);
        System.out.println("moduleName:"+moduleName);
        paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    private String findModuleName(String URI) {
        String moduleName = null;
        
        if(URI.startsWith("/"))
            URI = URI.replaceFirst("/", "");
        
        for(String webFolder : this.webFolders){
            if(URI.startsWith(webFolder)) {
                URI = URI.replaceFirst(webFolder+"/", "");
                break;
            }
        }
        
        if(URI.indexOf("/") < 0)
            moduleName = "/";
        else
            moduleName = URI.substring(0, URI.indexOf("/"));
        return moduleName;
    }
}
