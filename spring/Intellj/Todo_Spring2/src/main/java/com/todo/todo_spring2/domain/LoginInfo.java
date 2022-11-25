package com.todo.todo_spring2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
/*로그인 정보(세션에 저장해서 가지고다닐용도)*/
public class LoginInfo {

    private String uid;
    private String uname;
    private String uphoto;
}
