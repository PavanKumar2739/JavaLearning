import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	public static String timeConversion(String s) throws Exception  {
	    // Write your code here
	    SimpleDateFormat disFormat=new SimpleDateFormat("HH:mm:ss");
	    SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
	    Date d=parseFormat.parse(s);
	    return disFormat.format(d);

	    }
	public static void main(String[] args) throws Exception {
		System.out.println(timeConversion("07:05:45PM"));
	}

}
