package com.todo.todo_spring2.mapper;

import com.todo.todo_spring2.domain.TodoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    //리스트 전체출력
    List<TodoDTO> selectAlltodo();
    //입력
    int inserttodo(TodoDTO todoDTO);
    //선택출력
    List<TodoDTO> selectBytodo(int tno);

    //수정
    int updatetodo(TodoDTO todoDTO);

    //삭제
    int deleteBytodo(int deptno);


}
