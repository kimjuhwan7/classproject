package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OrcaleDao;
import dept.domain.Dept;
import dept.utll.ConnectionProvider;

public class UpdateService {

	Dao dao = new OrcaleDao();

	public int update(Dept dept) {
		int result = 0;
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();

			result = dao.update(conn, dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}

		return result;
	}
}
