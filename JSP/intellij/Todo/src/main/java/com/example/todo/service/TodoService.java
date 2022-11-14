package com.example.todo.service;

import com.example.todo.dao.TodoDAOImpl;
import com.example.todo.domain.TodoDTO;
import com.example.todo.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.List;

@Log4j2
public class TodoService {

    private TodoService() {
    }

    private static TodoService instance = null;

    public static TodoService getInstance() {
        if (instance == null) instance = new TodoService();
        System.out.println("getInstance_2");

        return instance;

    }

    private TodoDAOImpl dao = new TodoDAOImpl();

    public List<TodoDTO> getTodoDTOList() throws Exception {
        log.info("TodoService getTodoList...");
        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        List<TodoDTO> list = dao.selectAll(conn);
        return null;
    }

}
