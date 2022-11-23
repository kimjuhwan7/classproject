package com.todo.todospring.domain;

import lombok.*;
import org.springframework.stereotype.Service;

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
