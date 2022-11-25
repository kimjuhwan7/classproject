package com.todo.todo_spring2.controller;

import com.todo.todo_spring2.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
public class TodoListController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("list")
    public String gettodoList(Model model) {
        model.addAttribute("todoList", todoService.getList());
        log.info("투두리스트컨트롤러 통과");
        return "list";
    }

}
