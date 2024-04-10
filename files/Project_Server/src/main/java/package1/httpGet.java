package package1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class httpGet extends HttpServlet {
	protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException ,IOException {
		String name =req.getParameter("name");
		long mobNo=Long.parseLong(req.getParameter("num"));
		String pass=req.getParameter("pass");
		System.out.println("Name : "+name);
		System.out.println("phNO : "+mobNo);
		System.out.println("pass : "+pass);
	}

}
