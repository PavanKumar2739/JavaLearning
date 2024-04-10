package hibernate_OTM.pac;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String place;
	private String name ;
	@OneToMany
	private books engine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public books getEngine() {
		return engine;
	}
	public void setEngine(books engine) {
		this.engine = engine;
	}
}
