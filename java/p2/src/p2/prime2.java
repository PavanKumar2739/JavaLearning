package p2;

public class prime2 {
public static void main(String[] args) {
	  for (int i = 2; i <= 10; i++)         
      { 		  	  
         int counter=0; 	  
         for(int num =2; num<=i; num++)
        	
	  {
         int c=0;
            if(i%num==0)
	     {
		counter=counter+1;

		//System.out.println("");
		 c=i;
		
		
	     }

            if(counter>=2)
            {
            	//System.out.println(c);
            }
          if(counter<=1)
            
            System.out.println(i);
           
            	
}
}
}
}