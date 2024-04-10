package poly;

//class poly{
//
//    public static String removeWhiteSpaces(String str){
//		//Implement your code here and change the return value accordingly
//    	int i;
//    	int count=0;
//    	int b=str.length();
//    	//String a = " a";
//    	//System.out.println(b);
//    	//String st="Hello   How are you   ";
// for(i=0;i<b;i++)
//	
//	     {
//	  String a=(str.substring(i,i+1));
//	     char c=str.charAt(i);
//	     System.out.println(i);
//	   //  char v=str.charAt(4);
//	     //System.out.print(c);
//	     //System.out.println(v);
//	      
//	   // if (c==' ') 
//	      {
//	    	 // System.out.println("print");
//	    	  //System.out.println(count+=count);
//	     //  continue;
//	      }
//	    if (a=="H") {
//	    	System.out.println("print");
//	    	continue;
//	    	
//	    }
//	     else
//	     
//	    // System.out.print(c);  
//	    System.out.println(a);
//	       
//	     }
////String c = null;
// //String s=Character.toString(c);
//    return null;
//	}
//	
//	public static void main(String args[]){
//		String str="Hello   How are you   ";
//	//	Tester st= new Tester(); 
//		str=removeWhiteSpaces(str);
//		System.out.println(str);
//	}
//}
class poly{
	String str;

     public String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
    int i;
    String a = null;
    String b="";
    for(i=0;i<str.length();i++)
    {
        a=str.substring(i,i+1);
        if(a.equals(" "))
        	continue;
//        else
//        	System.out.print(a);
        b=b.concat(a);
    }
    
    return b;
	
    }
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		poly st=new poly();
		str = st.removeWhiteSpaces(str);
		System.out.println(str);
	}
}
