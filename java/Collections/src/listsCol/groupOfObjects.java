package listsCol;

import java.util.*;

class student {
	int rollNo;
	String name, Address;

	student(int rollNo, String name, String Address) {
		this.rollNo = rollNo;
		this.name = name;
		this.Address = Address;
	}
	student(int rollNo) {
		this.rollNo = rollNo;
	}

	public String toString() {
		return " "+rollNo+" "+name+" ";
	}
//	void method() {
//		student i=new student(10,"p","a");
//	}
	
}

class groupOfObjects {

	public static void main(String[] args) {
		List<student> s =new ArrayList<>();
		student i = new student(10, "pavan", "udamalapadu");
		student j = new student(10, "kumar", "akkurthi");
		student k = new student(10, "chanda", "Bagani");
		student l = new student(10, "viju", "bagani1");
		student m = new student(10, "pavan", "srikalahasti");
		
		s.add(i);
		s.add(j);
		s.add(k);
		s.add(l);
		s.add(m);
		
		for(int p=0;p< s.size();p++) {
			student st=s.get(p);
			System.out.println(st.Address+" "+st.name+" "+st.rollNo);
		}

	//we can do all operations remoc=ve,set,sort,indrxof,contains,sublist etc	
	}
}
