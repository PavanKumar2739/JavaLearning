package first.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.myConfig;

public class comp2 {
	public static void main(String[] args) {
		ApplicationContext con =new AnnotationConfigApplicationContext(myConfig.class);
		List test=con.getBean("getList",ArrayList.class);
		System.out.println(test.add(test));
	}
	


}
