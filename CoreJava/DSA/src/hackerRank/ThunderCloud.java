package hackerRank;

public class ThunderCloud {
	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[] {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
	}
	static int jumpingOnClouds(int[] c, int k) {
        int n = c.length;
        int jump = (0+k)%n;
        int e = 100;
        if(c[jump]==1){
            e -= 3;
        }else{
            e -=1;
        }
        while(jump!=0){
            jump = (jump+k)%n;
            if(c[jump]==1){
            e -= 3;
        }else{
            e -=1;
        }
        }
        return e;


    }


}
