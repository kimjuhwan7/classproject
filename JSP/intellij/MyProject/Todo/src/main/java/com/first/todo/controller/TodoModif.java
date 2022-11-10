package com.first.todo.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoModif", value = "/TodoModif")
public class TodoModif extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Modify get()");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/modify.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Modify post()");

        response.sendRedirect("/todo/list");
    }
}
