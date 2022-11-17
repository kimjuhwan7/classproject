package firstcoding.spring_todo.controller;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/index")
public class TodoRegister {

    @GetMapping
    public String getRegister() {
        log.info("TodoRegister_getRegister");
        return "register";
    }

    @PostMapping
    public String postRegister() {
        log.info("TodoRegister_postRegister");
        return "list";
    }
}
