package com.app.springsecurity;

import com.app.springsecurity.entity.Member;
import com.app.springsecurity.entity.MemberRole;
import com.app.springsecurity.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertMember() {

        Member member = Member.builder()
                .email("admin@gmail.com")
                .name("관지라-1")
                .roleSet(new HashSet<MemberRole>())
                .password(passwordEncoder.encode("1111"))
                .build();
        //기본 권한 부여
        member.addMemberRole(MemberRole.ADMIN);

        memberRepository.save(member);

    }
}
