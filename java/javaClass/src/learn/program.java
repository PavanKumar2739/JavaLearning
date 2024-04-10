package learn;

public class program {
	char i='a';
	void m() {
	    assertEquals(1,1);
	}
	public static void main(String[] args) {
		int n=0;
		
		for (int i = 8; i < 8; i+=2) {
			for (int j = 8; j < i; j-=2) {
				if(i>=j/2) {
					continue;
				}
				else {
					n+=i+j;
					
				}
				
			}
			
		}
		System.out.println(n);
	}

}
