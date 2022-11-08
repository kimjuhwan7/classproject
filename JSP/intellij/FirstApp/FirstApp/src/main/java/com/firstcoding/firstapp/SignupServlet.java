package com.firstcoding.firstapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignupServlet", value = "/SignupServlet")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid1 = request.getParameter("userid1");
        String userpw1 = request.getParameter("userpw1");

        String memo = request.getParameter("memo");
        String gender = request.getParameter("gender");
        String lang = request.getParameter("lang");


        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<html>");
        out.write("<head><title>로그인 데이터</title></head>");
        out.write("<body>");
        out.write("<h1> userid : " + userid1 + "</h1>");
        out.write("<h1> pw : " + userpw1 + "</h1>");
        out.write("<h1> memo : " + memo + "</h1>");
        out.write("<h1> 성별 : " + gender + "</h1>");
        out.write("<h1> 언어 : " + lang + "</h1>");
        out.write("</body>");
        out.write("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String userid1 = request.getParameter("userid1");
        String userpw1 = request.getParameter("userpw1");

        String memo = request.getParameter("memo");
        String gender = request.getParameter("gender");

        String[] langs = request.getParameterValues("lang");
        String year = request.getParameter("year");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<html>");
        out.write("<head><title>로그인 데이터</title></head>");
        out.write("<body>");
        out.write("<h1> userid : " + userid1 + "</h1>");
        out.write("<h1> pw : " + userpw1 + "</h1>");
        out.write("<h1> memo : " + memo + "</h1>");
        out.write("<h1> 성별 : " + gender + "</h1>");

        for (String lang : langs) {
            out.write("<h1> 선택언어 : " + lang + "</h1>");
        }
        out.write("<h1> 선택년도 : " + year + "</h1>");

        out.write("</body>");
        out.write("</html>");

    }
}
