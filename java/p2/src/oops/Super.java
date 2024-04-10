package oops;
class Super {
	private int ID;
	private long con;
	public String add;
	double empsalPerDay;
	 int workingDays;
	int leavesTaken;
	public double totalSal;
	
	
//public Super(int id2, long con2, String add2, double empsalP, int leavesTa, double bonus) {
		// TODO Auto-generated constructor stub
	
public Super(int a,long b,String c, double empsalPerDay,int leavesTaken)
{
    this.ID=a;
    this.con=b;
    this.add=c;
    this.empsalPerDay= empsalPerDay;
    this.leavesTaken=leavesTaken;
    
    System.out.println("Employee Detals Salary Details");
    
}
 public void EmpDetails(int a)
 {
	 this.workingDays=a;
	 System.out.println("Employee ID : " + ID);
	 System.out.println("Contact number : " + con);
	 System.out.println("Address : " + add);
	 System.out.println("Salary per Day : " + empsalPerDay);
	 System.out.println("leaves Taken : " + leavesTaken);
	 System.out.println("Office Working days  : " + workingDays);
	 System.out.println( );
	 System.out.println("****************************");
	 System.out.println( );
 }
 
 void EmpDetails(float sal,String month)
 {
	// float sal;
	  month = null;
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
manager(int id,long Con, String Add, double empsalP,int leavesTa,double bonus)
{
	super(id,Con,Add,empsalP,leavesTa);
	System.out.println(id);
	this.bonus=bonus;
}
void Manager(float sal,String month) {
	// float sal;
		  month = null;
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


public class emplist
{
public static void main(String[] args) {
		
manager Man = new manager(101, 989797889,"bangalore", 30000.9 , 1,1000.3);

}
}


