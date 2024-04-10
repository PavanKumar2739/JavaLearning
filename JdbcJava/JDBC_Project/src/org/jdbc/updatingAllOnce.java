package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatingAllOnce {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			st=con.createStatement();
			int b= st.executeUpdate("insert into student values(6,'yuvi',40)");
			int c= st.executeUpdate("insert into student values(5,'yuvi',40)");
			int d= st.executeUpdate("insert into student values(4,'yuvi',40)");

			
			System.out.println("Table created ");
			System.out.println(b);
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
