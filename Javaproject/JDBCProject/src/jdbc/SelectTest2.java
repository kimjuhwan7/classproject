package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class SelectTest2 {

	public static void main(String[] args) {

		try {
	
//			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 객체 생성
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");	

			// 3. Statement / PreparedStatement
			String sql = "select * from dept where deptno=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();

			// ResultSet rs = stmt.executeQuery(sql);
			// 4. ResultSet
//			while (rs.next()) {
////				int deptno = rs.getInt("deptno");
////				String dname = rs.getString("dname");
////				String loc = rs.getString("loc");
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//
//				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
//			}
			if (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
			}

			rs.close();
//			stmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
