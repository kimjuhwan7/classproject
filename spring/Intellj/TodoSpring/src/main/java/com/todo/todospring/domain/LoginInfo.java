package com.todo.todospring.domain;

import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
@ToString
@Builder
public class LoginInfo {
    private String uid;
    private String uname;
    private String uphoto;
}
