package firstcoding.spring_todo.controller;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/remove")
public class TodoRemove {

    @GetMapping
    public String getRemove() {
        log.info("TodoRemove_getRemove");
        return "modify";
    }

}
