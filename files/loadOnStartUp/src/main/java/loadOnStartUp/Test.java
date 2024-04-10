package loadOnStartUp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(value = "/serve",loadOnStartup = 10)
public class Test  extends GenericServlet{
	public Test() {
		System.out.println("constructoror has called");
	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("All the resources of test are initialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse arg) throws ServletException, IOException {
		System.out.println("server method called");
		
	}
	public void destroy() {
		System.out.println("All the resources are closed");
	}

}
