package com.first.todo.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRegister", value = "/register")
public class TodoRegister extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String result = "등록(입력)";

        request.setAttribute("title", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String result ="TodoList";
    request.setAttribute("title",result);


        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");


        //등록 (처리)
        dispatcher.forward(request, response);


    }
}
