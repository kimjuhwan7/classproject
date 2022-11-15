package com.firstcoding.firstapp.login.dao;

import com.firstcoding.firstapp.login.domain.Member;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDaoImpl implements MemberDao {

    @Override
    public int insertMember(Connection conn, Member member) throws SQLException {

        String sql = "insert into member (uid,pw) values(?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,member.getUid());
        pstmt.setString(2,member.getPw());

        int result = pstmt.executeUpdate();


        return result;
    }

    @Override
    public Member selectByUidPw(Connection conn, String uid, String pw) {
        return null;
    }
}
