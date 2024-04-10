package otherOperator;

public class arr2 {
	public static void main(String[] args) {

		int [][] a = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			///System.out.println("len a[0] " +  a[0].length );
			
			for (int j = 0; j < a[i].length; j++){
				
				//System.out.println("len a[0] 1  " +  a[0] .length );
				//System.out.println("len " + j);
				
				if (a[i][j] % 2 == 0)
					break;
				//System.out.println("len a[0] we  " +  a[i][j] );
				
				sum += a[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}
	
	

