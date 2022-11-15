package com.firstcoding.firstapp.login.dao;

import com.firstcoding.firstapp.login.domain.Member;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    //회원 가입
    int insertMember(Connection conn, Member member) throws SQLException;

    // 회원 존재여부 확인
    Member selectByUidPw(Connection conn, String uid, String pw) throws SQLException;


    int updateUUIDByIdx(Connection conn, String uuid, int idx) throws SQLException;

    Member selectByUUID(Connection conn, String uuid) throws SQLException;
}
