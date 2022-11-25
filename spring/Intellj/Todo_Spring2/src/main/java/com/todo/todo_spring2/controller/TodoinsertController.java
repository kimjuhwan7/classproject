package com.todo.todo_spring2.controller;

import com.todo.todo_spring2.domain.TodoDTO;
import com.todo.todo_spring2.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
@RequestMapping("todo_in")
public class TodoinsertController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public String getForm() {
    log.info("컨트롤 갯폼 통과");
    return "in_register";
    }

    @PostMapping
    public String setForm(TodoDTO todoDTO) {
    log.info("컨트롤 셋폼 통과");
        todoService.todo_in(todoDTO);
        return "redirect:/list";
    }

/*
    @PostMapping
    public String todo_in() {


        todoService.todo_in();
        return ;
    }*/
}
