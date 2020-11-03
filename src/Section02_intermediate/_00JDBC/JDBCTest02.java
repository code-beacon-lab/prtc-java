package Section02_intermediate._00JDBC;

import java.sql.*;

public class JDBCTest02 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/ta09?useSSL=false&serverTimezone=UTC";
		String sql = "select * from student";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			printData(rs, "name", "id", "dept");
			rs = stmt.executeQuery("select name, id, dept from student where name='이기자'");
			printData(rs, "name", "id", "dept");
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 로드 에러");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void printData(ResultSet rs, String col1, String col2, String col3) throws SQLException {
		System.out.println("Start Method");
		while(rs.next()) {
			if(col1 != "")
				System.out.print(new String(rs.getString("name")));
			if(col2 != "")
				System.out.print("\t|\t"+rs.getString("id"));
			if(col3 != "")
				System.out.println("\t|\t"+rs.getString("dept"));
			else
				System.out.println();
		}
	}
}