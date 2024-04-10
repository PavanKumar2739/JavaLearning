package Batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addingRowsBatch {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			st=con.createStatement();
			 st.addBatch("insert into user values(8,'yuvi',40,'43763457')");
			 st.addBatch("insert into user values(7,'yad',22,'47547345')");
			 st.addBatch("insert into user values(6,'kohli',34,'534')");
			 int[] r=st.executeBatch();
			 for(int i:r)
			 {
				 System.out.println(1+"affected rows");
			 }
			System.out.println("inserted ");
			//System.out.println(b);
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
