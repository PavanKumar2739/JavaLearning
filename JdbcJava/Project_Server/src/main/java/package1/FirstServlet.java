package package1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("my first servlet");
		
	}
	

}
