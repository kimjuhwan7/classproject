package com.todo.todospring.service;


import com.todo.todospring.DAO.TodoDao;
import com.todo.todospring.DAO.TodoDaoImpl;
import com.todo.todospring.domain.TodoDTO;
import com.todo.todospring.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

@Log4j2
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoDao dao;

    static private TodoServiceImpl instance = new TodoServiceImpl(new TodoDaoImpl());

    @Autowired
    private TodoServiceImpl(TodoDao dao) {
        this.dao = dao;
    }

    public static TodoServiceImpl getInstance() {
        return instance;
    }

    @Override
    public List<TodoDTO> getTodoList() {
        List<TodoDTO> list = null;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            list = dao.selectAll(conn);
            log.info(list);
        } catch (Exception e) {
            e.printStackTrace();
            // 예외 발생 시 -> 빈 List 생성
            list = Collections.emptyList();
        }
        return list;
    }

    @Override
    public TodoDTO getTodo(long tno) {
        TodoDTO todoDTO = null;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            todoDTO = dao.selectByTno(conn, tno);
            log.info(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
            // 예외 발생 시 -> 빈 List 생성
            todoDTO = new TodoDTO();
        }
        return todoDTO;
    }

    @Override
    public int insertTodo(TodoDTO todoDTO) {
        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.insertToDo(conn, todoDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("로그인 실패 반환값 ->" + result);
        return result;
    }

    @Override
    public int modify(TodoDTO todoDTO) {
        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.updateTodo(conn, todoDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public int deleteBytno(long tno) {
        int result = 0;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.deleteTodo(conn, tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String imgInsertTodo(TodoDTO todoDTO) {
    return "";
    }
}