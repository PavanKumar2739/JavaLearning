package practice;

abstract class javaS8Exam {
	
	public static void main(String[] args) {
		int i[][]=new int[4][];
		i[0]=new int[1];
		i[1]=new int[2];
		i[2]=new int[3];
		i[3]=new int[3];
		for(int k=0;k<4;k++) {
			for(int j=0;j<k;j++) {
				int m=i[k][j];
			}
			
		}
	}

}
