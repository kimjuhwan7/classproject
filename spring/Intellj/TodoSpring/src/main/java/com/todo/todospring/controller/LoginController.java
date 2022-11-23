package com.todo.todospring.controller;

import com.todo.todospring.domain.Member;
import com.todo.todospring.service.LoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("/login")

public class LoginController {

    @Autowired
    private LoginService loginService;
/*로그인 화면으로 보내줌*/
    @GetMapping
    public String loginForm() {
        return "loginForm";
    }

    /*로그인 정보 일치여부 확인*/
    @PostMapping
    public String login(@RequestParam("uid") String uid,
                        @RequestParam("pw") String pw,
                        HttpServletRequest request,
                        HttpServletResponse response
    ) throws Exception {
        Member member = loginService.login(uid, pw);

        log.info("로그인 정보 확인 후 결과값 ->" + member);// 로그인 아이디와 비밀번호가 맞지 않으면 null반환
        if (member != null) {
            //로그인 처리
            HttpSession session = request.getSession();
            session.setAttribute("loginInfo", member.tologininfo());

        }


        return "redirect:/index.jsp";
    }
}
