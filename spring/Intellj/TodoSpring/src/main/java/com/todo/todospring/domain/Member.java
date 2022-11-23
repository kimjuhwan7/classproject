package com.todo.todospring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
/*로그인 정보 저장소*/
public class Member {

    private int idx;
    private String uid;
    private String pw;
    private String uuid;
    private String uname;
    private String uphoto;

    /*로그인 완료 후 세션에 등록할 데이터*/
    public LoginInfo tologininfo() {
        return LoginInfo.builder()
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();
    }

  /* 위와 같은 처리를 할 수 있지만 Login 후 비밀번호는 메모리에 등록하지 않도록 따로 분리
   public Member tologininfo() {
        return Member.builder()
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();
    }*/


}
