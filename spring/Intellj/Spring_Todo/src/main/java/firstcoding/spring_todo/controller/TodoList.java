package firstcoding.spring_todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/list")
public class TodoList {

    @GetMapping
    public String getlist() {
        log.info("TodoRegister_getlist");
        return "list";
    }

    @PostMapping
    public String postlist() {
        log.info("TodoRegister_postlist");
        return "list";
    }
}
