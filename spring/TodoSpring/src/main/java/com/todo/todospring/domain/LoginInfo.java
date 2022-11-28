package com.todo.todospring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginInfo {

    // 2022.11.28 추가
    private int idx;
    private String uid;
    private String uname;
    private String uphoto;

}
