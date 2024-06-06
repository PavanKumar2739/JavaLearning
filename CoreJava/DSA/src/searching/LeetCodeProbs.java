package searching;

public class LeetCodeProbs {
	
	public static void main(String[] args) {
		int [] nums = {-12,3451,2,6,-4543};
		int val =  findNumbers(nums);
		System.out.println(val);
	}
	static int findNumbers(int[] nums) {
		int count = 0;
		for(int num:nums) {
			if(isEven2(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean isEven(int num) {
		
		int count = 0;
		if(num==0) count =1;
		if(num<0) num*=-1;
		while(num>0) {
			num = num/10;
			count++;
		}
		
		return (count%2==0);
		
	}
	static boolean isEven2(int num) {
		if(num<0) num*=-1;
		int i = (int) Math.log10(num);
		System.out.println("num "+i);
		return ((int)(Math.log10(num))+1)%2==0;
	}

}

