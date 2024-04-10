package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConn {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Pavan@9676");
			System.out.println("connection established");
			st=con.createStatement();
			System.out.println("Statement");
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
		finally {
			if (con != null)
				con.close();
			System.out.println("closed con");
		}
		if (st != null)
			st.close();
		System.out.println("closed st");

	}
	

}
