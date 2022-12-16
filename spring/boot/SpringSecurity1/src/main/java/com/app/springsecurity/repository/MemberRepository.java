package com.app.springsecurity.repository;

import com.app.springsecurity.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {


}
