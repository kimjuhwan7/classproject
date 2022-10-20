package dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dept.dao.Dao;
import dept.dao.OrcaleDao;
import dept.domain.Dept;
import dept.utll.ConnectionProvider;

public class SelectService {

	// Service : 핵심 로직을 처리하는 영역
	// Controller 에서 요청한 결과를 생성하고 반환
	// 피룡한 DB 작업은 Dao 를 통해서 작업

	// Dao dao = new OrcaleDao(); // 의존한다!
	Dao dao;

	public SelectService(Dao dao) {
		this.dao = dao;
	}

	public List<Dept> select() {
		List<Dept> list = null;
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			list = dao.select(conn);

		} catch (SQLException e) {
			// e.printStackTrace();
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

		return list;// 비어있으면 null반환
	}
}
