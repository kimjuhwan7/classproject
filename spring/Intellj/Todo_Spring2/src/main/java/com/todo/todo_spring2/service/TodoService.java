package com.todo.todo_spring2.service;

import com.todo.todo_spring2.domain.TodoDTO;

import java.util.List;

public interface TodoService {

    //리스트 전체 출력
    List<TodoDTO> getList();

    //입력
    int todo_in(TodoDTO todoDTO);

}
