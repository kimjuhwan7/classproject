package com.firstcoding.firstapp.cookie;

import jdk.jpackage.internal.Log;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookiViewServlet", value = "/cookie/view")
@Log4j2
public class CookiViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Cookie 확인
        Cookie[] cookies = request.getCookies();


        for (Cookie c : cookies) {
            log.info(c.getName() + " = " + c.getValue());

        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/view.jsp");
        dispatcher.forward(request, response);
    }


}
