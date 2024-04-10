package userData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Result;

public class upDate extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException  {
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			ps=con.prepareStatement("select * from userData where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			PrintWriter wr=res.getWriter();
			if(rs.next()) {
			ps=con.prepareStatement("update userData set name=?  where id= ?") ;
			ps.setInt(2, id);
			ps.setString(1, name);
			//ps.setInt(3, 30);
			int r=ps.executeUpdate();
			wr.write("<html><body><h2> user which id "+id+" updated with name "+name+ " </h2></body></html>");
			System.out.println(r+" rows effected");
			}
			else {
				wr.write("<html><body><h2> user which id "+id+" not exists </h2></body></html>");
			}
		}
			catch (ClassNotFoundException | SQLException e) {
				System.out.println(e);
			} 
			finally {
				try{if (con != null) {
					con.close();
				System.out.println("closed con");
				}
				if (ps != null) {
					ps.close();
				System.out.println("closed st");
				}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
	

}
