
public class IsLeap {
	public static String dayOfProgrammer(int year) {
	    // Write your code here
	    boolean isLeap=false;
	    if(year>=1700 && year<=1917){
	        if(year%4==0)
	             isLeap=true;
	        
	    }
	    else if(year==1918)return "26.09."+year;
	    else{
	         if((year%4==0&&year%100!=0)||year%400==0){
	             isLeap=true;
	         }
	    }
	    
	   if(isLeap) return "12.09."+year;
	   return "13.09."+year;

	    }

	public static void main(String[] args) {

	    // year to be checked
	    int year = 1800;
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  }

}
