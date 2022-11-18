package com.todo.todospring.controller;

import com.todo.todospring.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Log4j2

public class TodoReadController {

    @Autowired
    private TodoService todoService;


    @GetMapping("/todo/read")
    public void readTodo(Model model, @RequestParam("tno") int tno) {
        log.info("TodoReadController.readTodo");

        model.addAttribute("todo", todoService.getTodo(tno));

//        return "todo/read";
    }

}
