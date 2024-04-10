package searching;

public class Search2DArray {
	public static void main(String[] args) {
		int[][] arr = {
				{23,3},
				{18,2,31,99},
				{3,44,99,2},
				{12,140}
		};
		int trg = 99;
		
		System.out.println(search(arr,trg));
		System.out.println(max(arr));
	}
	private static String search(int[][] arr,int trg) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				if(arr[i][j]==trg) {
					return "Row : "+i+" Column :"+j;
				}
			}
			
		}
		return "-1"; 

	}
	private static int max(int[][] arr) {
		// TODO Auto-generated method stub
		int ans = arr[0][0];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
					ans= ans>arr[i][j]?ans:arr[i][j];
			}
			
		}
		return ans; 

	}
}
