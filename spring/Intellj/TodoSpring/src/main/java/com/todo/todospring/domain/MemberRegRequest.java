package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
/*이미지 저장되었는 도메인*/
public class MemberRegRequest {
    private String uid;
    private String pw;
    private String uname;
    private MultipartFile uphoto;


    public Member toMember() {
        Member member = Member.builder()
                .uid(this.uid)
                .pw(this.pw)
                .uname(this.uname)
                .build();
        return member;
    }

}
