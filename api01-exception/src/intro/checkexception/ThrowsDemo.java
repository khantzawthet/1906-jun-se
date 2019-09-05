package intro.checkexception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		try {
			showDate("17.08.2019","20");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	static void showDate(String dateString, String ageString) throws ParseException {
		
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = format.parse(dateString);
		System.out.println("User Enter Date: " + date);
		
		int age = Integer.parseInt(ageString);
		System.out.println("User Age: " + age);
	}

}
