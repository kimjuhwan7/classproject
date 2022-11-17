package firstcoding.spring_todo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TodoDaoImpl implements TodoDao {
    @Override
    public List<TodoDao> selectAll(Connection conn) throws SQLException {
        return null;
    }

    @Override
    public TodoDao selectByTno(Connection conn, long tno) throws SQLException {
        return null;
    }

    @Override
    public int insertTodo(Connection conn) throws SQLException {
        int result = 0;
        String sql = "inserti into "

        return 0;
    }

    @Override
    public int updateTodo(Connection conn) throws SQLException {
        return 0;
    }

    @Override
    public int deleteTodo(Connection conn) throws SQLException {
        return 0;
    }
}
