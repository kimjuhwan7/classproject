package com.todo.todospring.service;

import com.todo.todospring.domain.TodoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/*my sql연결해서 CRUD 처리코드 인터페이스*/
@Service
public interface TodoService {

    List<TodoDTO> getTodoList();

    TodoDTO getTodo(long tno);

    int insertTodo(TodoDTO todoDTO);

    int modify(TodoDTO todoDTO);

    int deleteBytno(long tno);

    String imgInsertTodo(TodoDTO todoDTO);
}
