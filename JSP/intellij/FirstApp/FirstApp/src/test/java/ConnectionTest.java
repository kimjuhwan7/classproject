import com.firstcoding.firstapp.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

    @Test
    public void testConnections() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Drivers");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3301/project", "scott", "tiger");

        Assertions.assertNotNull(conn);

        conn.close();
    }

    @Test
    public void testPoolConnections() throws Exception {
        Connection conn = ConnectionUtil.getInstance().getConnection();

        System.out.println(conn);

        Assertions.assertNotNull(conn);

        conn.close();
    }
}
