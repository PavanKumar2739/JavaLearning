package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class saveData {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		employee e=(employee)context.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}

}
