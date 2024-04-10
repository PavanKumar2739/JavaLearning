package projectLogics;

public class fibnnoci {
	
	void method1(int num) {
		int a=1;
		int sum=0;
		int count=1;
		System.out.println(0);
		while (sum<num){
			System.out.println(count);
			count=a+sum;
			sum=a;
			a=count;
//			count=sum;
//			a=count;
			
		}
	}
	public static void main(String[] args) {
		
		fibnnoci f=new fibnnoci();
		f.method1(10);
			
	}

}
