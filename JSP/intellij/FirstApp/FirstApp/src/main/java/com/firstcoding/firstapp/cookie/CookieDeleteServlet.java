package com.firstcoding.firstapp.cookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CookieDeleteServlet", value = "/cookie/delete")
public class CookieDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("userid", "");
        // 쿠키 삭제 메소드는 없다! -> 소멸 시간을 0으로 적용해서 소멸
        cookie.setMaxAge(0);

        response.addCookie(cookie);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/delete.jsp");
        dispatcher.forward(request, response);
    }

}
