package oops;


class Super {
	private int ID;
	private long con;
	public String add;
	double empsalPerDay;
	 int workingDays;
	int leavesTaken;
	public double totalSal;
	public String month;
	public int bonus;
	
	
	
//public Super(int id2, long con2, String add2, double empsalP, int leavesTa, double bonus) {
		// TODO Auto-generated constructor stub
	
 Super(int ID,long b,String c, double empsalPerDay,int leavesTaken)
{
    this.ID=ID;
    this.con=b;
    this.add=c;
    this.empsalPerDay= empsalPerDay;
    this.leavesTaken=leavesTaken;
    
	//super(a,b,c,empsalPerDay, leavesTaken);
	
    System.out.println("Employee Detals Salary Details \n ***************");
}
    public int getid() {
     return ID;
    }
//    public void setid(int ID) {
//    	this.ID=ID;
//    }

 public void EmpDetails(int a)
 {
	 this.workingDays=a;
	 System.out.println("Employee ID : " + ID);
	 System.out.println("Contact number : " + con);
	 System.out.println("Address : " + add);
	 System.out.println("Salary per Day : " + empsalPerDay);
	 System.out.println("leaves Taken : " + leavesTaken);
	 System.out.println("Office Working days  : " + workingDays);
     System.out.println("Bonus : " + bonus);
	 System.out.println( );
	 System.out.println("****************************");
	 System.out.println( );
 }
 
 void Sal(String month)
 {
	 float sal;
	// String month = null;
	 int work= workingDays-leavesTaken;
	sal = (float)(empsalPerDay *work);
	if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("aug")
			|| month.equalsIgnoreCase("oct") || month.equalsIgnoreCase("dec"))
	{
	 totalSal=(double)(sal+(31-workingDays));
	 System.out.println("Total Salary getting to the EMP: "+ ID + " in in the month "+ month+" in INR is "+ totalSal);
	
	}
	 else if(month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("nov")) 
	 {
		 totalSal=(double)(sal+(30-workingDays));
		 System.out.println("Total Salary getting to the EMP: "+ ID + " in in the month "+ month+" in INR is "+ totalSal); 
	 }
	 else 
	 {
		if(month.equalsIgnoreCase("febL"))
		{
			totalSal=(double)(sal+(29-workingDays));
			System.out.println("Total Salary getting to the EMP: "+ ID + " in in the month "+ month+" in INR is "+ totalSal); 
		}
		else
		{
			totalSal=(double)(sal+(28-workingDays));
		    System.out.println("Total Salary getting to the EMP: "+ ID + " in in the month "+ month+" in INR is "+ totalSal); 

		}
	 }	 
 }
}



class manager extends  Super
{
double bonus;
Super sup;
int ID;
private long con;
public String add;
double empsalPerDay;
public double totalSal;
public double workingDay;
public int leavesTa;



manager(int ID,long con, String add, double empsalP,int leavesTa,double bonus,Super sup)
{
	//super(ID,con,add,empsalP,leavesTa);
	this.sup=sup;
	
	System.out.println(ID);
	this.bonus=bonus;
	this.leavesTa=leavesTa;
	//this.empsalP=empsalP;
	//System.out.println(empsalPerDay);
	 System.out.println("Bonus : " + bonus);
	 workingDay=getSuper().workingDays;
}
public Super getSuper()
{
	return sup;
}


void ManagerSal(String month)
{
	
		float sal;
	// String month = null;
		this. getSuper().EmpDetails(20);
		


try { 
	double work= (workingDay-leavesTa);
	sal = (float)(empsalPerDay *work);
	if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("aug")
			|| month.equalsIgnoreCase("oct") || month.equalsIgnoreCase("dec"))
	{
		 totalSal=(double)(sal+empsalPerDay*(31- getSuper().workingDays)+bonus);
	 System.out.println("Total Salary getting to the EMP: "+ getSuper(). getid() + " in in the month of "+ month +" in INR is "+ totalSal);
	
	}
	 else if(month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("nov")) 
	 {
		 getSuper(). totalSal=(double)(sal+empsalPerDay*(30-getSuper().workingDays)+bonus);
		 System.out.println("Total Salary getting to the EMP: "+  getSuper().getid() + " in  the month of "+ month+" in INR is "+ totalSal); 
	 }
	 else 
	 {
		if(month.equalsIgnoreCase("febL"))
		{
			 getSuper().totalSal=(double)(sal+empsalPerDay*(29-workingDay)+bonus);
			System.out.println("Total Salary getting to the EMP: "+  getSuper().getid() + " in the month of "+ month+" in INR is "+ totalSal); 
		}
		else if(month.equalsIgnoreCase("feb"))
		{
			 getSuper().totalSal=(double)(sal+empsalPerDay*(28-workingDay)+bonus);
		    System.out.println("Total Salary getting to the EMP: "+ getSuper(). getid() + "  in the month of "+ month+" in INR is "+ totalSal); 

		 }
		else
		{
			System.out.println("> Given input is not proper : if you had given month fully kindly give it to 'mon' form  ");
			System.out.println("> For example Month is january  Give first 3 words so you should need to give 'jan' ");
			System.out.println("************************************************* ");
			System.out.println("> when comes to february month give first three letters and if it is leap year add 'L' at last  ");
			System.out.println("> Ex: febL");
		}
			
	   }
	
	 }
catch(ArithmeticException e)
	{
		System.out.println("Given input is not proper");
	}
	
catch(Exception e2)
{
	System.out.println("Given input were not proper : if you had given month fully kindly give it to 'mon' form  ");
	System.out.println("For example Month is january, Give first 3 words so you should need to give 'jan' ");
	System.out.println("***************************** ");
	System.out.println("when comes to february month give first three letters and if it is leap year add 'L' at last  ");
	System.out.println("Ex: febL");
	}

	}
}

public class emplist
{
public static void main(String[] args) {
Super s=new Super(102,998786867L,"bangalore",1000,2);
//Give the employee data in the order Id,contact number,address,emp sal perday ,leaves in that month, bonus	
manager Man = new manager(101, 989797889,"bangalore", 3000.9 , 1, 10000.34,s);

// give the no of working days
//Man.EmpDetails(21);

//give month 
//note:give first three words of the month 
//for feb you have to give febL if it is leap year
Man.ManagerSal("feb");
s.Sal("mar");
s.EmpDetails(21);

}
}
