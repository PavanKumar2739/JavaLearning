package leetcode;

public class TrailingSpaces {

	public static void main(String[] args) {
		String num="1230";
		StringBuffer stringBuff=new StringBuffer(num);
		stringBuff.reverse();
		String[] sb=stringBuff.toString().split("");
		int i=0;
		for(String s:sb) {
			if("0".equals(s)) {
				i++;
				continue;
			}
			else {
				break;
			}
		}
		System.out.println(stringBuff.delete(0, i).reverse());
	}
}
