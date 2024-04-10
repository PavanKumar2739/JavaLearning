package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carDrive {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("carEngine.xml");
	car c=con.getBean(car.class);
	c.getE().start();
}
}
