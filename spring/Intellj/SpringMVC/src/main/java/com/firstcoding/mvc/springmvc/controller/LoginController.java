package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.LoginRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Log4j2
@Controller
@RequestMapping("/login")
public class LoginController {

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getLoginForm(Model model) {
        model.addAttribute("msg", "아이디와 패스워드를 반드시 입력하셈!");
        return "login/form";

    }

    //    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String login(String uid,
                        String pw,
                        String p,
                        @RequestParam(value = "p", defaultValue = "1") String page,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        @ModelAttribute("req") LoginRequest loginRequest,
                        @RequestParam Map paramMap
    ) {
        String uId2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");

        log.info("uid = >" + uid);
        log.info("pw=>" + pw);
        log.info("p=>" + page);
        log.info("uId2=>" + uId2);
        log.info("pw2=>" + pw2);
        log.info("loginRequest=>" + loginRequest);
        log.info("paramMap => " + paramMap);

        return "login/login";// "redirect:/index"
    }


    @GetMapping("/info") //http://localhost:8080/login/info
    public String info() {
        return "login/info";
    }
}
