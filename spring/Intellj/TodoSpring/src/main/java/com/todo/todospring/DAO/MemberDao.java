package com.todo.todospring.DAO;

import com.todo.todospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
@Repository
public interface MemberDao {
    /*멤버 추가*/
    int insertMember(Connection conn, Member member) throws SQLException;
    /*로그인화면 아이디 비빈번호 비교*/
    Member selectByIdPw(Connection conn, String uid, String pw) throws SQLException;


    /*인서트 이미지*/
    int insertImg(Connection conn, Member member) throws SQLException;
}
