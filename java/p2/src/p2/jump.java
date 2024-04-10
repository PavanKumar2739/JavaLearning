package p2;
import java.util.Scanner;
public class jump {
	 static void primeNumbers(int r, int n ) {
		int i,j,c2=0;	
		int c=0;		
		for(i=2;i<=n;i++)
		{
		c=0;
		for(j=2;j<=i;j++)
			{
			if(i%j==0)
				c++;
			}
		if(c==1) {
			System.out.println(i);
			c2++;
		}	
		/*if(c2==r) {
			System.out.println(r+"th prime number is" +i);
			continue;
		}*/	
	}
	}
	 static void nthPrimeNumbers( int r,int n ) {
			int i,j,c2=0;	
			int c=0;
			
			for(i=2;i<=n;i++)
			{
			c=0;
			for(j=2;j<=i;j++)
				{
				if(i%j==0)
					c++;
				}
			if(c==1) {
				//System.out.println(i);
				c2++;
			}
			if(c2==r) {
				System.out.println(r+"th prime number is" +i);
				break;
			}
		}
		}
	public static void main(String[] args) {
		//int r=10;
		//int n=40;		
		Scanner sc=new Scanner(System.in);
		System.out.println("give number r");
		int r=sc.nextInt();
		System.out.println("give number of prime numbers should be printed");
	    int n=sc.nextInt();
	    //int a=10;	    
	    primeNumbers(r,n);
		nthPrimeNumbers(r,n);
		}
	}
	
		



