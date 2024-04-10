package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class getUser {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		user e=(user)context.getBean("user");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}
}
