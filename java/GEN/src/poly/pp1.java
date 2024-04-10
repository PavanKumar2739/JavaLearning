package poly;

class poly1{

	public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
    	int i;
    	int count=0;
    	int b=str.length();
    	char c;
    	String s = "";
    	String a;
    	str=str;
    	
    	//System.out.println(b);
    	//String st="Hello   How are you   ";
 for(i=0;i<b;i++)
	     {
//	  a=(str.substring(i,i+1));
	      c=str.charAt(i);
	       //s=Character.toString(c);
	    // System.out.println(i);
	    
	   //  char v=str.charAt(4);
	     //System.out.print(c);
	     //System.out.println(v);
	      
	   if (c==' ') 
	      {
	    	 // System.out.println("print");
	    	  //System.out.println(count+=count);
		   
	      continue;
	       
	/* if (a.equals(" "))
	    {
	    	//System.out.println("print");
	    	continue;
	    }
	    
	     else
	     {
	    	 s=s.concat(a); 
	     }*/
	     
	     
	    //System.out.print(c);  
	   // System.out.println(a); 
	     
//String c = null;
	  
	     }    
	   s=s+c;
	   
	     }
 a=(String)s;
 return a;
   
	}
	
	
	public static void main(String args[]){
		String str="Hello   How are you  ";
	//poly1 st= new poly1(); 
		String str1=removeWhiteSpaces(str);
		System.out.println(str1);
	}
}