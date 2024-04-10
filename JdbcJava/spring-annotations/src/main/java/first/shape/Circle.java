package first.shape;

import org.springframework.stereotype.Component;

@Component("circ")
public class Circle implements shape{

	public void display() {
		System.out.println("this is a circle");
	}
}
