package com.example.todo.controller;

import com.example.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoListController", value = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("todo list...");


        // 출력 결과
        //String title = "Todo List";

        request.setAttribute("title", "Todo List");

        request.setAttribute("list", TodoService.getInstance());
        System.out.println("todoList_1");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);
    }

}
