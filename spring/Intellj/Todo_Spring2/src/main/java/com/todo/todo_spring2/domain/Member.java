package com.todo.todo_spring2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;
    private String uname;
    private String uphoto;

}
