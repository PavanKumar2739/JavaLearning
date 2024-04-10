package oops;

public class bike {
	
	static int wheels=2;
     String clr;
     int w;
    // String name;
	bike(String color, int weight)
	{
	 clr=color;
	 w=weight;
	}
 static void bikeFeatures() 
{
System.out.println("wheels for all bikes "+ wheels);
//System.out.println(" "+ clr);
}
 
 static void bikeBrake() 
 {
 System.out.println("Hydraulic Breaking system");
 System.out.println("Disk break is available");
 //System.out.println(" "+ clr);
 }
 static String bikeBrake1() 
 {
 return ("ElectroMagnetic Breaking system");
 //System.out.println(" "+ clr);
 }
 public void millage(int m) 
 {
 System.out.println("Millage is " + m +"kmpl");
 //System.out.println(" "+ clr);
 }
 public void features(String name,int m) {
	System.out.println("--" + name +"--");
	System.out.println("no of wheels for RF is " + wheels);
	System.out.println("Color of RF is " + clr);
	System.out.println("weight of bike " +  w +"kgs" );
	millage(m);
	if(name.equalsIgnoreCase("rf"))
		bikeBrake();
	else if(name.equalsIgnoreCase("r15"))
		bikeBrake();
	else if(name.equalsIgnoreCase("Duke"))
			System.out.println(bikeBrake1());		
 }
public static void main(String[] args) {
	bikeFeatures(); 
	bike RF=new bike("white",200);
   bike R15=new bike("Black",180);
bike Duke=new bike("Yellow",170);

RF.features("RF", 20);
R15.features("R15",40);
Duke.features("Duke",35);
//	System.out.println("--RE--");
//	System.out.println("no of wheels for RF is " + RF.wheels);
//	System.out.println("Color of RF is " + RF.clr);
//	System.out.println("weight of bike " +  RF.w +"kgs" );
//	RF.bikeBrake();
//	RF.millage(20);
//	System.out.println("");
//	System.out.println("--R15--");
//	System.out.println("no of wheels for R15 is "+ R15.wheels);
//	System.out.println("Color of R15 is " + R15.clr);
//	System.out.println("weight of bike " +  R15.w +"kgs");
//	System.out.println(R15.bikeBrake1());
//	R15.millage(30);
//	System.out.println("");
//	System.out.println("--Duke--");
//	System.out.println("no of wheels for Duke is "+ Duke.wheels);
//	System.out.println("Color of Duke is " + Duke.clr);
//	System.out.println("weight of bike " +  Duke.w +"kgs" );
//	Duke.bikeBrake();
//	Duke.millage(25);
//	
	}
	
	

}
