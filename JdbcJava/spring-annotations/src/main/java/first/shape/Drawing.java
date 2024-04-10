package first.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drawing {
	@Autowired
	@Qualifier("circ")
	shape s;
	
	public void draw() {
		s.display();
	}

}
