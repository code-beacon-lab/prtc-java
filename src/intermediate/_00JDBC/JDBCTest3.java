package intermediate._00JDBC;

import java.sql.*;

public class JDBCTest3 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/ta09?useSSL=false&serverTimezone=UTC";
		String sql = "insert into student (name, id, dept) values('아무개', '0893012','컴퓨터공학')";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","1234");
			stmt = conn.createStatement();

			stmt.executeUpdate(sql);
			printTable(stmt);
			
			sql ="update student set id = '0189011' where name='아무개'";
			stmt.executeUpdate(sql);
			printTable(stmt);
			
			sql ="delete from student where name='아무개'";
			stmt.executeUpdate(sql);
			printTable(stmt);
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 로드 에러");
		} catch(SQLException e) {
			System.out.println("DB 연결 에러");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void printTable(Statement stmt) throws SQLException {
		System.out.println("Print table");
		ResultSet srs = stmt.executeQuery("select * from student");
		while(srs.next()) {
			System.out.print(srs.getString(2));
			System.out.print("\t|\t"+srs.getString(1));
			System.out.println("\t|\t"+srs.getString(3));
		}
	}

}