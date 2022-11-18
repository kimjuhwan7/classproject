package com.todo.todospring.controller;

import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Log4j2
@Controller
@RequestMapping("/todo/register")
public class TodoInsertController {

    private final TodoService todoService;

    public TodoInsertController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping
    public String getINsertForm() {

        return "todo/register";
    }

    @PostMapping
    public String insert(@RequestParam("todo") String todo,
                         @RequestParam("dueDate") String dueDate) {

        log.info(todo);
        log.info(dueDate);

        TodoDTO todoDTO = TodoDTO.builder()
                .todo(todo)
                .dueDate(LocalDate.parse(dueDate))
                .build();

        log.info("todoDTO => " + todoDTO);

        todoService.insertTodo(todoDTO);

        return "redirect:/todo/list";
    }

}
