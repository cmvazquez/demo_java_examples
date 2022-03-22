import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarType {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
		
		System.out.println("\n Calendar.getInstance() " + cal);
		System.out.println("\n SimpleDateFormat.format() " + format.format(cal.getTime()));

		Calendar cal2 = new GregorianCalendar();
		System.out.println("\n cal2 = new GregorianCalendar()" + cal2);
		System.out.println("\n cal2 " + format.format(cal2.getTime()));
	}

}
