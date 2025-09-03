package interview_ques;

public class TesterAB implements A,B{

	@Override//explicitly ask to override the method
	public void method() {
		// TODO Auto-generated method stub
		A.super.method();
	}

}
