package p2;
public class bike {

	static int wheels=2;
     String clr="";
     int w=0;
     private String wheel;
	/*bike(String color, int weight)
	{
	 clr=color;
	 w=weight;
	}*/
     public bike(String wheel)
     {
    	 this.wheel=wheel;
     }
     public String  getWheel() {
    	 return wheel;
    	 
     }
     
    public void setWheel(String wheel)
    {
    	this.wheel=wheel;
    }
     
 public void bikeFeatures() 
{
System.out.println("wheels for all bikes "+ wheels);
//System.out.println(" "+ clr);
System.out.println("Wheel count" + wheel);
}
}
class bike2{	
public static void main(String[] args) {
	
	String W="Ceat";
	bike RF=new bike(W);
   bike R15=new bike(W);
bike Duke=new bike(W);
 RF.clr="white";
 R15.clr="green";
 Duke.clr="black";
 RF.w=200;
 R15.w=180;
 Duke.w=170;
 RF.bikeFeatures(); 
 
	System.out.println("no of wheels for RF is " + RF.wheels);
	System.out.println("Color of RF is " + RF.clr);
//	System.out.println("weight of bike " +  RF.w +"kgs" );
//	System.out.println("no of wheels for R15 is "+ R15.wheels);
//	System.out.println("Color of R15 is " + R15.clr);
//	System.out.println("weight of bike " +  R15.w +"kgs");
//	System.out.println("no of wheels for Duke is "+ Duke.wheels);
//	System.out.println("Color of Duke is " + Duke.clr);
//	System.out.println("weight of bike " +  Duke.w +"kgs" );
 
//	
//	
	}
	

}
