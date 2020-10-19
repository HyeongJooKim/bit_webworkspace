package com.bit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class OracleJeju {

	private String user = "scott";
	private String password = "tiger";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private Connection conn = null;
	
	public Connection getConnection() {
		Logger log = Logger.getGlobal();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			log.info("Error: DB Connection");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			log.info("Error: Driver Connection");
		}
		return conn;
	}
}
