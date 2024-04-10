package first;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	@Value(value = "2")
	private int id;
	private int age;
	private String name;
	
	public Hospital(@Value(value = "24") int age){
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	@Value(value = "pavan")
	public void setName(String name) {
		this.name = name;
	}
	

}
