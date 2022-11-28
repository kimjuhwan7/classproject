package com.todo.todospring.controller;

import com.todo.todospring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodolistController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/todo/list")
    public String getTodoList(Model model) {

        model.addAttribute("todoList", todoService.getTodoList());

        return "todo/list";
    }
}
