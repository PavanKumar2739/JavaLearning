package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;;

public class featching1 {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("give input : ");
		int id=s.nextInt();
		Connection con=null;
		PreparedStatement pst =null;
		//ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			pst=con.prepareStatement("delete from student where id=?");
			pst.setInt(1, id);
			pst.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		finally {
			if (con != null)
				con.close();
			System.out.println("closed con");
			if (pst != null)
				pst.close();
			System.out.println("closed st");
						System.out.println("closed r");
		}
		

	
;
		}
}
