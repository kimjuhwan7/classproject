package com.firstcoding.firstapp.filter;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "UTF8Filter", urlPatterns = {"/*"})
@Log4j2
public class UTF8Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        log.info("UTF-8 Filter...");
        //요청 처리 전 처리해야 할 코드

        HttpServletRequest req = (HttpServletRequest) request;
        req.setCharacterEncoding("UTF-8");


        chain.doFilter(request, response);
        // 응답 처리 전 처리해야할 코드


    }
}
