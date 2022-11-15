package com.firstcoding.firstapp.login.controller;

import com.firstcoding.firstapp.login.domain.Member;
import com.firstcoding.firstapp.login.service.MemberService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MemberRegController", value = "/member/register")
@Log4j2
public class MemberRegController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("회원 가입 폼...");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/regform.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("회원가입 처리...");

        //사용자 입력 데이터 받기
        String uid = request.getParameter("uid");
        String pw = request.getParameter("pw");

        Member member = Member.builder()
                .uid(uid).pw(pw).build();

        log.info(member);
        int result = 0;


        try {
            result = MemberService.getInstance().insertMember(member);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        if (result > 0) {
            log.info("회원 가입 성공");
        } else {
            log.info("회원 가입 실패");

        }

        response.sendRedirect("/index.jsp");

    }
}
