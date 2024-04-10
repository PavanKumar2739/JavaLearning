package hibernate_Bi_OTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String city;
private String state;
private int pin;
@OneToOne(mappedBy = "Add")
private Hospital Add;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public Hospital getAdd() {
	return Add;
}
public void setAdd(Hospital add) {
	Add = add;
}
}
