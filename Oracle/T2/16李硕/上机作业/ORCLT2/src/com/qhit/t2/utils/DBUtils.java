package com.qhit.t2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection con;
	private static String driverName="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private static String username = "scott";
	private static String password = "tiger";
	
	public static Connection getConnection(){
		
		
			
		try {
			//¼ÓÔØÇý¶¯
			Class.forName(driverName);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
