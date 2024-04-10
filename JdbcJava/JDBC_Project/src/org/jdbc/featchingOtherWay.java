package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class featchingOtherWay {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st=null;
		ResultSet r=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			st=con.createStatement();
			boolean res= st.execute("select * from student");
			if(res)
				r=st.getResultSet();
			System.out.println("Id   |   Name   |   Age ");
			System.out.println("-------------------------");
			while (r.next()) {
				System.out.println(r.getInt(1)+"   |   "+r.getString(2)+"   |   "+r.getInt("age"));
			}
			System.out.println(r);
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
		finally {
			if (con != null)
				con.close();
			System.out.println("closed con");
			if (st != null)
				st.close();
			System.out.println("closed st");
			if (r != null)
				r.close();
			System.out.println("closed r");
		}
	}
		
}
