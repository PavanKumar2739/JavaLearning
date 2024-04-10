package preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class gettingFromUser {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("give id : ");
		int id=s.nextInt();
		Connection con = null;
		PreparedStatement pst=null;
		ResultSet r=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			pst=con.prepareStatement("select * from student where id =?");
			pst.setInt(1, id);
			r=pst.executeQuery();
			System.out.println("id   |   Name   |   Age ");
			System.out.println("-------------------------");
			while (r.next()) {
				System.out.println(r.getInt(1)+"   |   "+r.getString(2)+"   |   "+r.getInt("age"));
			}
			System.out.println(r);
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
			}



}
