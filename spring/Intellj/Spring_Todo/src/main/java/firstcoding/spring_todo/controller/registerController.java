package firstcoding.spring_todo.controller;

import firstcoding.spring_todo.domain.RegisterRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("index")
public class registerController {

    @GetMapping
    public String getRegister() {
        log.info("registerController_getRegister...");

        return "register";
    }

    @PostMapping
    public String postRegister(@ModelAttribute("memo") RegisterRequest registerRequest) {
        log.info("registerController_postRegister...");

        log.info("registerRequest => " + registerRequest);


        return "list";
    }

}
