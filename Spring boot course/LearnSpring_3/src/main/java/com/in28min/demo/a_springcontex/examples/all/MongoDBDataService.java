package com.in28min.demo.a_springcontex.examples.all;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository//indicates that annotatied class is used for database.
@Primary
public class MongoDBDataService implements DataSource{

	@Override
	public int[] reriveData() {
		return new int[] {1,3,10,9,42,7};
	}

}
