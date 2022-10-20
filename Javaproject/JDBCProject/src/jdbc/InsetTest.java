package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsetTest {

	public static void main(String[] args) {

		try {
			// 1.드라이버 로드 (생략 가능)
//			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 객체 생성
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//			String dbUrl = "jdbc:mysql://localhost:3306/project";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
//
//			if (conn != null) {
//				System.out.println("데이터베이스 연결!!!!!");
////				conn.close();
//			}

			// 3. Statement / PreparedStatement
			// insert
			String sql = "insert into dept values(?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 50);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("입력되었습니다.");
			}
			pstmt.close();
			conn.close();

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
