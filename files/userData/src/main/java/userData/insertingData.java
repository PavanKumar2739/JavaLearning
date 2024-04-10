package userData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class insertingData extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException {
		int id=Integer.parseInt(req.getParameter("id")) ;
		String name=req.getParameter("name");
		int age =Integer.parseInt(req.getParameter("age"));
		long phNo=Long.parseLong(req.getParameter("num"));
		String pass=req.getParameter("pass");
		
		Connection con=null;
		PreparedStatement ps=null;
		String insert="insert into userData values(?,?,?,?,?)";
		PrintWriter wr=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "Pavan@9676");
			System.out.println("connection established");
			ps=con.prepareStatement(insert);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setLong(4,phNo);
			ps.setString(5, pass);
			ps.executeUpdate();
			System.out.println("data added successfully");
			wr.write("<html><body><h2> user which id "+id+" updated </h2></body></html>");
System.out.println(id +"  "+name+"  "+age+" "+phNo);
		} catch (SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(con!=null) {
				con.close();
			}
			if(ps!=null) {
				ps.close();
			}
			}
			catch (Exception e) {
			e.printStackTrace();
			}
		}
		
	}

}
