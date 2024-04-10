package userData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteData extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws SecurityException, IOException{
		int id=Integer.parseInt(req.getParameter("id"));
		Connection con=null;
		PreparedStatement pre=null;
		ResultSet rs=null;
		PrintWriter pw=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			pre=con.prepareStatement("select * from userData where id=?");
			pre.setInt(1, id);
			rs=pre.executeQuery();
			System.out.println("connection established");
			if(rs.next()) {
			pre=con.prepareStatement("delete from userData where id=?");
			pre.setInt(1, id);
			pre.execute();
			pw.write("<html><body><h2> user which id "+id+" deleted  </h2></body></html>");
			}
			else {
				pw.write("<html><body><h2> user which id "+id+" not exists </h2></body></html>");

			}
			
		}
		catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(pre!=null)
					pre.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
