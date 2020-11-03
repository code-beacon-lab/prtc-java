package Section02_intermediate._00JDBC;

import java.sql.*;

public class _00JDBC {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/ta09?useSSL=false&serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","1234");
			System.out.println(conn);
			System.out.println("DB연결 완료");
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 로드 에러");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
