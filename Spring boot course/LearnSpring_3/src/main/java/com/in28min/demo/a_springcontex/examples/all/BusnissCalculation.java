package com.in28min.demo.a_springcontex.examples.all;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.in28min.demo.looslycoupledgame.beans.GameRunner;
import com.in28min.demo.looslycoupledgame.beans.GamingConsole;

//@Component//this help to create a bean
@Service//indicates that annotated class has businesslogic
public class BusnissCalculation {
	
	DataSource dataSource;

	public BusnissCalculation(@Qualifier("MySqlDBDataServiceQualify") DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public int findMaxValue() {
		return Arrays.stream(dataSource.reriveData()).boxed().max((i1,i2)->i1.compareTo(i2)).orElse(0);
	}
	
	
	
}
