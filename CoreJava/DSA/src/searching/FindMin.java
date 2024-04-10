package searching;

public class FindMin {
public static void main(String[] args) {
	int [] arr = {1,3,343,5,7,9,54,97,3,10,4,5,23,345,65,6,7,1};
	System.out.println(min(arr));
}
private static int min(int[] arr) {
	// TODO Auto-generated method stub
	int ans = arr[0];
	for(int i = 1;i<arr.length;i++)
		ans= ans>arr[i]?arr[i]:ans;
    return ans; 
}
}
