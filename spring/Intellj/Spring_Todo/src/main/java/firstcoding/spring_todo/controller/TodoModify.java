package firstcoding.spring_todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/modify")
public class TodoModify {

    @GetMapping
    public String getModify() {
        log.info("TodoModify_getModify");
        return "modify";
    }


}
