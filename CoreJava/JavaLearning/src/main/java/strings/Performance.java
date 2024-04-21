package strings;

public class Performance {
	public static void main(String[] args) {
		String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a'+i);
			series = series+ch;
			
		}
		System.out.println(series); // time complexity is o(n2)
		//so the solution is string builder.
	}

}
