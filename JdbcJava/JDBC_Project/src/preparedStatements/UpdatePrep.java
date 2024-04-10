package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrep {
	public static void main(String[] args) throws Exception {
	Connection con=null;
	PreparedStatement ps=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
		ps=con.prepareStatement("update student set name=? ,age=? where id= 1") ;
		ps.setInt(2, 8);
		ps.setString(1, "kohli");
		//ps.setInt(3, 30);
		int r=ps.executeUpdate();
		System.out.println(r+" rows effected");
	}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
		finally {
			if (con != null) {
				con.close();
			System.out.println("closed con");
			}
			if (ps != null) {
				ps.close();
			System.out.println("closed st");
			}
		}
		

	
}

}
