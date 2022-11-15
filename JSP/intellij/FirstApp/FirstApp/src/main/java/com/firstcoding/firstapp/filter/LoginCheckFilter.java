package com.firstcoding.firstapp.filter;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginCheckFilter" ,urlPatterns = {"/mypage/*"})
@Log4j2
public class LoginCheckFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        log.info("로그인 체크 필터 진입...");
        // Sesstion 객체에 loginInfo 속성이 존재 하는지 체크 -> 로그인 체크
        // 없으면 ->로그인 페이지로 이동

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        HttpSession session = req.getSession();

        if (session.getAttribute("logInfo") == null) {
            log.info("비 로그인 상태 -> 로그인 페이지로 이동");

            resp.sendRedirect("/login");
            return;
        }


        chain.doFilter(request, response);
    }
}
