package com.todo.todospring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

/*리스트 내용*/
public class TodoDTO {

    private long tno;

    @NotEmpty
    private String todo;
    
    @NotEmpty
    @Future
    private LocalDate dueDate;
    private boolean finished;

}