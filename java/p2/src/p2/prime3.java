package p2;

public class prime3 {
	 public static void main(String[] args)
     {
         int i,j,count=0;
         //print prime no between 1 to 100
         System.out.println("prime number between 1 to 100\n");
         
         //loop for printing prime no between 1 to 100
         for(i=2;i<=100;i++)
         {
            for(j=1;j<=i;j++)
            {
              if(i%j==0)
                count++;
            }
            if(count==2)
              System.out.print(" "+i);
            count=0;
          }
}
}