package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClose {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
		finally {
			if (con != null)
				con.close();
		}

	}

}
