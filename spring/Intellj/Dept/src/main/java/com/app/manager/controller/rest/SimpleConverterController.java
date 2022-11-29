package com.app.manager.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Log4j2
@Controller
@RequestMapping("/mc/simple")
public class SimpleConverterController {

    @GetMapping
    public void form() {
        log.info("form...");
    }

    @PostMapping
    @ResponseBody//문자열로 출력
    public String simple(@RequestBody String body) {

        log.info("body >>>>>>>>" + body);
        return "body >>>>>>>>" + body;
    }
}
