package package1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class formData extends GenericServlet{
	public formData() {
		System.out.println("constructoror has called");
	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("All the resources of test are initialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("called");
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);

	}

}
