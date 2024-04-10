package onetoone;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class questions {

	@Id
	private int id;
	@Column(nullable = false)
	private String sub;
	
	@OneToOne
	@JoinColumn()
	private ans a;
	
	public ans getA() {
		return a;
	}
	public void setA(ans a) {
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	
	
}
