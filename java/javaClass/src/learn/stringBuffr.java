package learn;

public class stringBuffr {
	static void meth(String a,int...i) {
		System.out.print(a);
		for(int l:i)
		{
			System.out.println(l);
		}
		//System.out.println(l);
	}
	public static void main(String[] args) {
		meth("pav");
		meth("pav",1,32,1);
		StringBuffer sb =new StringBuffer("pavan");
		System.out.println(sb.append(" kumsr"));
		System.out.println(sb.delete(1,6));
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1,4));
		System.out.println(sb.insert(1,"yadav"));
		System.out.println(sb.replace(1,5,"fd"));
	}

}
class m
{
	public static void m2() {
		System.out.println("asjds");
	}
}