package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class verify {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("pass-persion.xml");
		persion p=con.getBean(persion.class);
		p.pass.details();
	}

}
