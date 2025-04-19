package com.hrmsProject.genaricLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	private static final String DbUrl="jdbc:mysql://localhost:3306/practice";
	private static final String DbUsername="root";
	private static final String DbPassword="onkar";
	
	
	public ResultSet ConnectDB(String query) throws SQLException {
		Connection conn =DriverManager.getConnection(DbUrl,DbUsername,DbPassword);
		Statement stmt=conn.createStatement();
		return stmt.executeQuery(query);
		
	}

}
