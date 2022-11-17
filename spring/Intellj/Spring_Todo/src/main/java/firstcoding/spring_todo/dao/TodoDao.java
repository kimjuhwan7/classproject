package firstcoding.spring_todo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface TodoDao {
    //전체출력
    List<TodoDao> selectAll(Connection conn) throws SQLException;

    //하나 출력
    TodoDao selectByTno(Connection conn, long tno) throws SQLException;

    //등록
    int insertTodo(Connection conn) throws SQLException;

    //수정
    int updateTodo(Connection conn) throws SQLException;

    //삭제
    int deleteTodo(Connection conn) throws SQLException;


}
