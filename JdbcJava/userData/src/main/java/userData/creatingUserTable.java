package userData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class creatingUserTable {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Statement st=null;
		String que="create table userData(id int primary key,name varchar(20) null,age int null,phone bigint(30) unique,password varchar(40))";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
		System.out.println("connection established");
		st=con.createStatement();
		boolean b= st.execute(que);
		System.out.println("Table created ");
		System.out.println(b);
		}
		catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				con.close();
			}
			if(st!=null) {
				st.close();
			}
		}
	}

}
