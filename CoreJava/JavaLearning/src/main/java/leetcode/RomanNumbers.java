package leetcode;

public class RomanNumbers {
 public static void main(String[] args) {
	 String s="MDCXCV";
	 int previous=0;
	 int current=0;
	 int sum=0;
	 int count=0;
	 boolean flag=false;
	 //int i=0;
	char []c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		
		if(c.length==1) {
			sum=number(c[i]);
		}
		previous=current;
		current=number(c[i]);
		if(current==previous ) {
			
			if(i==c.length-1&& count<i) {
				sum+=current+previous;
			}else {
			sum+=(previous);
			}
			count++;
//			 current=0;
//			   previous=0;
		}
 		else if((current<previous ||( c.length-1>i&& current==number(c[i+1])))&& previous!=0 ) {
 			
			if(i==0)
			  sum+=previous;
			else if(i==c.length-1&& count<i) {
				sum+=current+previous;
				//current=0;
			}
			else
		      sum+=previous;
			
			count++;
		}
		else if(current>previous && previous!=0) {
			count++;
			sum+=current-previous;
			current=0;
			
			//i++;
		}
		else if(i==c.length-1&& count<i)
			sum+=current;
	
	}
	System.out.println(sum);
}
 
 public static int number(char c) {
	 int count=0;
	 if(c=='I') {
			count=1;
		}
		else if(c=='V') {
			count=5;
		}
		else if(c=='X') {
			count=10;
		}
		else if(c=='L') {
			count=50;
		}
		else if(c=='C') {
			count=100;
		}
		else if(c=='D') {
			count=500;
		}
		else if(c=='M') {
			count=1000;
		}
	 return count;
 }
	
}
