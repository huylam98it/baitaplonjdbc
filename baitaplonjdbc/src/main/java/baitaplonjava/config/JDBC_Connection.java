package baitaplonjava.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {

	public static final String url = "jdbc:sqlserver://localhost;database=btljava";
	public static final String user = "sa";
	public static final String password = "Huylam98";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.err.println("khong tim thay driver");
		} catch (SQLException e) {
			System.out.println("khong the ket noi csdl");
		}
		return con;
	}

}
