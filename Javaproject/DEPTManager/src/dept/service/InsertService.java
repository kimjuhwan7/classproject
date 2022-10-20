package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OrcaleDao;
import dept.domain.Dept;
import dept.utll.ConnectionProvider;

public class InsertService {

	Dao dao = new OrcaleDao();

	public int insert(Dept dept) {

		int result = 0;
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();

			result = dao.insert(conn, dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
