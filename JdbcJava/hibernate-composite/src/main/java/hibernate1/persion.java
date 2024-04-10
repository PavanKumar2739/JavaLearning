package hibernate1;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class persion {
	@EmbeddedId
	private persionId id;
	private String name;
	private int age;
	
	public persionId getId() {
		return id;
	}
	public void setId(persionId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
