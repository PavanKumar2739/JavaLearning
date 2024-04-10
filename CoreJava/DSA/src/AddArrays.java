import java.util.List;

public class AddArrays {
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	int count=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            System.out.println("int i = "+i+" "+"int j = "+j+" "+(ar.get(i)+ar.get(j)));
            if((ar.get(i)+ar.get(j))%k==0){
                
                count++;
            }
        }
    }
    return count;

}
	public static void main(String[] args) {
		divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2));
	}


}
