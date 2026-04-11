package com.in28min.demo.a_springcontex.examples.a2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySqlDBDataServiceQualify")
public class MySqlDBDataService implements DataSource{

	@Override
	public int[] reriveData() {
		return new int[] {1,3,4,92,42,5};
	}

}
