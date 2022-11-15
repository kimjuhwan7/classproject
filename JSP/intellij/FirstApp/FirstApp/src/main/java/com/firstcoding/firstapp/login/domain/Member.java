package com.firstcoding.firstapp.login.domain;


import lombok.*;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@Builder
@ToString
@Getter
@Setter

public class Member {
    private  int idx;
    private  String uid;
    private  String pw;
    private  String uuid;
}
