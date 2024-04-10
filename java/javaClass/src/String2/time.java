package String2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import learn.comp2;

class C{
//	public  void d(int b,String...strings)
//	{
//		System.out.println(strings[strings.length-1]);
//	}
//	
//	public static void main(String[] args) {
//		new C().d(5,"infosys");
//		new C().d(4,"infosys","limited");
//	}
	String S;
	C(String S)
	{
		this.S=S;
		
	}
	public boolean eq(Object ob)
	{
		return ((C)ob).S==this.S;
	}
//	public int hashCode() {
//		return S.length();
//	}
	
}
class M{
	public static void main(String[] args) {
		Map<C,String> map=new HashMap<C,String>();
		map.put(new C("jack"), "sendSalesReport");
		map.put(new C("jack"), "sendAuditReport");
		map.put(new C("mady"), "sendInventoryReport");
		
		System.out.println(map.size());
	}
}