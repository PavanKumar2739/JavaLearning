package premitive;

class p1 {
	String name="pavan";
	String comp;
	
	p1(String name,String comp)
	{
		this.comp=comp;
		this.name=name;
		System.out.println(this.name);
		System.out.println(name);
	}
public static void main(String[] args) {
	p1 obj1=new p1("selena","infosys");
	p1 obj2=new p1("pavan kumar","infosys1");
	p1 obj3=new p1("Ravi","TCS");
	p1 obj4=new p1("rani","apple");
	
	p1 emp[]= {obj1,obj2,obj3,obj4};
	System.out.println(emp.length);
	for(int i=0;i<emp.length;i++)
	{
		System.out.println("Employee Details : "+ emp[i].name+ " and " +emp[i].comp);
	}
}
}
