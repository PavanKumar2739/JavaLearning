package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
public static void main(String[] args) {
	int [] num= {1,3,5,5,7};
	System.out.println(Arrays.toString(num));
	changeVal(num);
	System.out.println(Arrays.toString(num));
}

static void changeVal(int [] a) {
	a[2]=20;
}
	
    
}
