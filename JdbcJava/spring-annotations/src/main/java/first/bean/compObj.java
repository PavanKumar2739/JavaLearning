package first.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.myConfig;

public class compObj {
	public static void main(String[] args) {
		ApplicationContext con =new AnnotationConfigApplicationContext(myConfig.class);
		TestBean test=con.getBean(TestBean.class);
		System.out.println(test.list);
	}
	

}
