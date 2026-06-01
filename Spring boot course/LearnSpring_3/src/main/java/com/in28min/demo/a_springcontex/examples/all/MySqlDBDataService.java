package com.in28min.demo.a_springcontex.examples.all;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component//this is base for all steriotye annotations
@Repository//indicates that annotatied class is used for database.
@Qualifier("MySqlDBDataServiceQualify")
public class MySqlDBDataService implements DataSource{

	@Override
	public int[] reriveData() {
		return new int[] {1,3,4,92,42,5};
	}

}
