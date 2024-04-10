package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class first {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException("AE");
		}
		catch(ArithmeticException e){
			System.out.println(e.getClass());
		}
		catch (Exception e) {
			System.out.println("last one called");
		}
		
//		try {
//			return;
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//	
//		finally{
//			System.out.println("in finally");
//		}
//
//		Integer[][] val= {{10,20},{null}};
//          System.out.println(val[1][1].intValue());
		List<String> list1=new ArrayList<>();
		list1.add("1");
		list1.add("3");
		list1.add(1,"2");
		System.out.println(list1);
		List<String> list2=new ArrayList();
		list1.addAll(list2);
		// list2=list1.subList(2, 6);
		list2.clear();
		System.out.println(list1+" ");
		
		List<Float> f=new LinkedList<>();
		f.add(12.1f);
		f.add(null);
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("EEEE",Locale.US);
	System.out.println(dt.format(LocalDateTime.now()));
	}
	public Integer exception(Integer...i) throws Exception,ArithmeticException{
		return 0;
	}

}
