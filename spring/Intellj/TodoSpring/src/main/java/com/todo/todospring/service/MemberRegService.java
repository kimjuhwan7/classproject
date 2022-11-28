package com.todo.todospring.service;

import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.domain.TodoImgDTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public interface MemberRegService {



    int memberReg(MemberRegRequest regRequest, HttpServletRequest request) throws Exception;

/*
    int todoReg(TodoImgDTO imgDTO, HttpServletRequest request);
*/
}
