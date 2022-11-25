package com.todo.todo_spring2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

/*리스트 내용*/
public class TodoDTO {

    private long tno;
    private String todo;
    private LocalDate dueDate;
    private boolean finished;

}