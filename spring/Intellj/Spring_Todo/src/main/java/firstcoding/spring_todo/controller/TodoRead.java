package firstcoding.spring_todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/read")
public class TodoRead {

    @GetMapping
    public String getTodoRead() {
        log.info("TodoTodoRead_getTodoRead");
        return "read";
    }

    @PostMapping
    public String postTodoRead() {
        log.info("TodoTodoRead_postTodoRead");
        return "list";
    }
}
