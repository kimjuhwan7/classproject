package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OrcaleDao;
import dept.utll.ConnectionProvider;

public class DeleteService {
	Dao dao = new OrcaleDao();

	public int delete(int deptno) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.delete(conn, deptno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		return result;
	}
}
