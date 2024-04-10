package otherOperator;

class tester{
	int res;
	
	tester(int res)
	{
		this.res=res;
	}
	
	public void simpleMethod(int num)
	{
	System.out.println(res*num);	
	}
	public static void main(String[] args) {
		int num=10;
		tester ob=new tester(10);
		//ob.res=10;
		ob.simpleMethod(num);
	}
}