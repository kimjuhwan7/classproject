package com.firstcoding.firstapp.cookie;

import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "CookiCreateServlet", value = "/cookie/create")
@Log4j2
public class CookiCreateServlet extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("userid", "cool");
        cookie.setMaxAge(60 * 10);

        response.addCookie(cookie);

        // 유니크한 식별 값
        UUID str = UUID.randomUUID();
        log.info("유니크한 식별 값 생성=> " + str.toString());
        Cookie c = new Cookie("uuid", str.toString());
        c.setMaxAge(60 * 60 * 24 * 7);

        c.setHttpOnly(true);// Javascript에서 접속이 불가하다!!!!!!!

        response.addCookie(c);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/create.jsp");
        dispatcher.forward(request, response);
    }

}
