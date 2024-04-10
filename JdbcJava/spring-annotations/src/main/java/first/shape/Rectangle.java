package first.shape;

import org.springframework.stereotype.Component;

@Component("rec")
public class Rectangle implements shape{

	public void display() {
		System.out.println("this is a rectangle");
	}
}
