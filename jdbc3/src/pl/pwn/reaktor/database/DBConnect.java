package pl.pwn.reaktor.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
	private Connection con;
	
	private Statement stmt;
	
	public DBConnect(String user, String pass) throws SQLException {
		
		String conPath = "jdbc:mysql://localhost:3306/skoczkowie?useSSL=false";
		con = DriverManager.getConnection(conPath, user, pass);
		stmt = con.createStatement();
	}

	public Connection getCon() {
		return con;
	}

	public Statement getStmt() {
		return stmt;
	}
	
	public void close() throws SQLException {
		if (con != null) {
			con.close();
		}
		if (stmt !=null) {
			stmt.close();
		}
	}

}
