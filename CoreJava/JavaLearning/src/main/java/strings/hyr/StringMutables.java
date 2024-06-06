package strings.hyr;

public class StringMutables {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Pavan");
		sb.append("Kumar");
		System.out.println(sb);
		
		sb.insert(0, "pk ");
		
		System.out.println(sb);
		
		sb.delete(0, 2);
		
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(100);
		
		System.out.println(sb.capacity());
		
		//to compare strings both are equal or not we use compareTo
		sb.reverse();
		
		StringBuilder sb2 = new StringBuilder("PavanKumar");
		//if we go with equals
		System.out.println(sb.equals(sb2));
		
		System.out.println(sb.compareTo(sb2));// 0 means both have same
		
	}
	

}
