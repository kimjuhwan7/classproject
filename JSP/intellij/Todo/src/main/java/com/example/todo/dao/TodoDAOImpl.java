package com.example.todo.dao;

import com.example.todo.domain.TodoDTO;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TodoDAOImpl {

    public List<TodoDTO> selectAll(Connection conn) throws Exception {

        String sql = "select * from tbl_todo";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        List<TodoDTO> result = new ArrayList<>();

        while (rs.next()) {
            result.add(new TodoDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
        }
        return result;
    }


    public TodoDTO selectBy(Connection conn, long tno) throws SQLException {
        TodoDTO n_tno = null;

        String sql = "select * from tbl_todo where tno=? ";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, tno);
        @Cleanup ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            n_tno = new TodoDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getBoolean(4));
        }
        return n_tno;
    }
//    public TodoDTO insertTodo(Connection conn, TodoDTO dto) throws  SQLException{
//        int result =0;
//        String sql = "insert into tbl_todo()";
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//        pstmt.setString(1,);
//    }


    public int updateTodo(Connection conn, TodoDTO dto) throws SQLException {

        int result = 0;
        String sql = "update tbl_todo set todo=?,duedate=?,finished=? where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getTodo());
        pstmt.setString(2, dto.getDueDate());
        pstmt.setBoolean(3, dto.isFinished());
        pstmt.setLong(4, dto.getTno());

        result = pstmt.executeUpdate();

        return result;
    }

    public int deleteTodo(Connection conn, TodoDTO dto) throws SQLException {
        int result = 0;
        String sql = "delete from tbl_todo where tno=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, dto.getTno());

        result = pstmt.executeUpdate();


        return result;
    }
}
