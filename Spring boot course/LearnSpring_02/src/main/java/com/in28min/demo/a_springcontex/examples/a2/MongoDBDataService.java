package com.in28min.demo.a_springcontex.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataSource{

	@Override
	public int[] reriveData() {
		return new int[] {1,3,10,9,42,7};
	}

}
