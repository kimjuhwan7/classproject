package com.app.springsecurity.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class AuthMemberDTO extends User {

    private String email;
    private String name;

    //커스텀유저 security로 로그인하면 AuthMemberDTO를 가지고있는다
    public AuthMemberDTO(
            String username,
            String password,
            Collection<? extends GrantedAuthority> authorities, String name) {
        super(username, password, authorities);
        this.name = name;
    }
}
