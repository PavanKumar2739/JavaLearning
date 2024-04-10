package hibernate_relative;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Engine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int cc;
	private int noc;
	@OneToOne
	private Car car;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
}
