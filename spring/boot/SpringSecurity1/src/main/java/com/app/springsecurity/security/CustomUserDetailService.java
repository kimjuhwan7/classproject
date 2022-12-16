package com.app.springsecurity.security;

import com.app.springsecurity.entity.Member;
import com.app.springsecurity.entity.MemberRole;
import com.app.springsecurity.repository.MemberRepository;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;


    @Override//유저name가지고 처리해서 정보를 뽑고 반환을 UserDetails로 인증처리된 정보와 권한 반환
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("loadUserByUsername => " + username);
        Optional<Member> result = memberRepository.findById(username);

        if (result.isEmpty()) {
            throw new UsernameNotFoundException("Check User Email");
        }

        Member member = result.get();
        log.info(">>>>>>>>>>>member => " + member);

        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        for (MemberRole memberRole : member.getRoleSet()) {
            authorityList.add(new SimpleGrantedAuthority("ROLE_" + memberRole.name()));
        }

        AuthMemberDTO authMember = new AuthMemberDTO(
                member.getEmail(),
                member.getPassword(),
                authorityList,
                member.getName());

        return authMember;
    }

}
