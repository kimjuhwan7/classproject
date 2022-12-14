package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {

    // Todo 전체 리스트
    List<TodoDTO> selectAll();

    // tno 값으로 하나의 Todo 정보를 가져오는 메소드

    TodoDTO selectByTno(long tno);

    // Todo 정보 입력
    int insertToDo(TodoDTO dto);

    // Todo 정보 수정
    int updateTodo(TodoDTO dto);

    // Todo 정보 삭제
    int deleteTodo(long tno);

}
