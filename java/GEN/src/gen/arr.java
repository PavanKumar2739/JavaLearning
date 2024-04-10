package gen;

public class arr {
		/*public static void main(String s[]) {
			int a[] = { 12, 15, 16, 17, 19, 23 };
			for (int i = a.length - 1; i > 0; i--) {
				if (i % 3 != 0) {
					--i;
					System.out.println("array "+a[i]);
				}
				System.out.println(a[i]);
			}
		}

	}*/

	/*public static void main(String args[]) {
		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
		int total = 1;

		for (int i = 0; i < inputArray.length; i++)
		{
			System.out.println("length" + inputArray[i].length);
			for (int j = 1; j < inputArray[i].length - 1; j++) {
				total *= inputArray[i][j];
			}
		}
		System.out.println("Result = " + total);
	}
}*/
	
	public static void main(String[] args) {

		int [][] a = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("len a[0] " +  a[0].length );
			
			for (int j = 0; j < a[0].length; j++){
				
				System.out.println("len a[0] 1  " +  a[0] .length );
				System.out.println("len " + j);
				
				if (a[i][j] % 2 == 0)
					break;
				System.out.println("len a[0] we  " +  a[i][j] );
				
				sum += a[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
