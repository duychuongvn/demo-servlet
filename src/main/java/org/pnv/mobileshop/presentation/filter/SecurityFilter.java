package org.pnv.mobileshop.presentation.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityFilter implements Filter {

    private List<String> SECURE_URLS = Arrays.asList("/usermanagement/");

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest,
     * javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        // HttpServletResponse httpServletResponse = (HttpServletResponse)
        // response;
        // HttpSession session = httpServletRequest.getSession(false);
        // if(session != null) {
        // chain.doFilter(request, response);
        // return;
        // }
        //
        // httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
        //
        // TODO: filter which url that user can access by get information in
        // session
        System.out.println("SecurityFilter - doFilter");
        chain.doFilter(request, response);
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub

    }

}
