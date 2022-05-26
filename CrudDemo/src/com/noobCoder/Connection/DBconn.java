package com.noobCoder.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/irctc_data_demo";
	private static final String USER = "root";
	private static final String Pass = "kiran@2202";

	private static Connection conn = null;
	static {

		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(URL, USER, Pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConn() {
		return conn;
	}
}
