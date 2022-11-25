package com.todo.todo_spring2.service;

import com.todo.todo_spring2.domain.TodoDTO;
import com.todo.todo_spring2.mapper.TodoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    //리스트출력
    @Override
    public List<TodoDTO> getList() {
        log.info("서비스 리스트 통과");
        return todoMapper.selectAlltodo();
    }


    @Override
    public int todo_in(TodoDTO todoDTO) {
        log.info("서비스 입력 통과");
        return todoMapper.inserttodo(todoDTO);
    }
}
