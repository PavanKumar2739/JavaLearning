package com.in28min.demo.a_springcontex.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//this is introduced in 16
//this help to manage he objects easy way without writing getters and setters we can have the functions if needed inside.
//equals and hashcode and to string is automatically created
record Person(String name,int age, Address address) {};

record Address(String village,String city) {};

@Configuration//class contains beans that spring wants to manage, all beans will define inside of the class
public class HelloWorldConfiguration {

	
	@Bean
	public String name() {
		return "Pavan";
	}
	
	@Bean
	public int age() {
		return 27;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(),address());//one way is direct method calls inside of the type 2 person 
	}
	
	
	
	@Bean
	public Person person3Parameters(String name,int age, Address address3) {
		return new Person(name,age,address3);//this way its injecting the beans while accessing the variable, address3 bean will be injeted here
	}
	
	@Bean
	public Person person5Parameters(String name,int age, Address address2) {
		return new Person(name,age,address2);//this way its injecting the beans while accessing the variable 
		//to make things better we use the qualifer to choose the bean
	}
	
	@Bean
	public Person person4Parameters(String name,int age, @Qualifier("Address3Qualifier") Address address2) {//using qualifier to call the address directly
		return new Person(name,age,address2);//this way its injecting the beans while accessing the variable
	}
	@Bean
	public Person person() {
		return new Person("Kumar",23, new Address("Village2","TPT"));
	}
	
	@Bean(name = "address2")//by this we cn configure our custom bean. so we can able to call the bean as address2
	//@Primary
	public Address address() {
		return new Address("UP","SKHT");
	}
	
	@Bean(name = "address3")//by this we cn configure our custom bean. so we can able to call the bean as address2
	@Qualifier("Address3Qualifier")
	public Address address3() {
		return new Address("None","Heaven");
	}
}
