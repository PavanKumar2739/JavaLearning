package hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class getPersion {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("dev");
		EntityManager managr= fac.createEntityManager();
		persionId p=new persionId();
		p.setEmail("pavan@email");
		p.setPhone(2938488);
		persion p1=managr.find(persion.class, p);
		if(p1!=null) {
			System.out.println("name:"+p1.getName());
			System.out.println("age:"+p1.getAge());
			System.out.println("mail:"+p1.getId().getEmail());
			System.out.println("phone:"+p1.getId().getPhone());
		}
		else {
			System.out.println("NA");
		}
	}
	

}
