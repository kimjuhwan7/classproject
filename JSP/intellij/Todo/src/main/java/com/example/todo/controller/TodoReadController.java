package com.example.todo.controller;

import com.example.todo.domain.TodoDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoReadController", value = "/todo/read")
public class TodoReadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("read get...");

        // 사용자 요청 tno 받기
        String tno = request.getParameter("tno");
        System.out.println("요청번호 :" + tno);

        //Service 요청한 tno로 할일 목록을 검색해서 결과 -> todoDTO로 반환
     TodoDTO todo = new TodoDTO(1, "숙제", "2022-11-30", false);
       request.setAttribute("todo", todo);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/read.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
