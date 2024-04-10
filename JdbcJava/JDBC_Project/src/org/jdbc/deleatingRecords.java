package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleatingRecords {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			st=con.createStatement();
			boolean b= st.execute("delete from student where id in(1) ");
			System.out.println("Record deleted ");
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
