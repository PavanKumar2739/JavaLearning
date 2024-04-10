package first.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import first.myConfig;

public class testDrawing {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(myConfig.class);
		Drawing dw=con.getBean(Drawing.class);
	    dw.draw();
	}
	

}
