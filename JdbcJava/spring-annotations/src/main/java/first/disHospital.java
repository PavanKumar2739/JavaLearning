package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class disHospital {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(myConfig.class);
		Hospital h=con.getBean(Hospital.class);
		System.out.println(h.getId());
		System.out.println(h.getName());
		System.out.println(h.getAge());
	}
	
 
}
