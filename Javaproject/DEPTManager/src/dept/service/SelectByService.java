package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OrcaleDao;
import dept.domain.Dept;
import dept.utll.ConnectionProvider;

public class SelectByService {

	Dao dao = new OrcaleDao();

	public Dept selectByDeptno(int deptno) {

		Dept dept = null;
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			dept = dao.selectByDeptno(conn, deptno);
		} catch (SQLException e) {
			e.printStackTrace();// 실제 서비스는 catch에 추가코드입력
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
		return dept;
	}
}
