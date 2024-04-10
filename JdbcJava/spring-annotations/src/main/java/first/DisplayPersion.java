package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DisplayPersion {
public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(myConfig.class);
	persion p=con.getBean(persion.class);
	System.out.println("id :"+p.getId());
	System.out.println("age :"+p.getAge());
}
}
