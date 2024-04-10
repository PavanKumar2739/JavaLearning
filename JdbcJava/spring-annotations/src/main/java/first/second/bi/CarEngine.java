package first.second.bi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.myConfig;

public class CarEngine {
public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(myConfig.class);
	Car c=con.getBean(Car.class);
	c.e.start();
}
}
