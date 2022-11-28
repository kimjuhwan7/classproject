package com.todo.todospring.controller;

import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.service.TodoService;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Data
@Controller
@RequestMapping("/todo/imgregister")
public class TodoImgInsertController {

    private final TodoService todoService;

/*

    @PostMapping
    public String Ing(MemberRegRequest regRequest, HttpServletRequest request) {


    }
*/
}
