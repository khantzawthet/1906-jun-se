package intro.checkexception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryCatchDemo {

	public static void main(String[] args) {
		showDate("17/08/2019");
	}
	
	static void showDate(String dateString) {
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			
			Date date = format.parse(dateString);
			System.out.println("User Enter Date: " + date);
			
		} catch (ParseException e) {
//			e.printStackTrace();
			String description = e.getMessage();
			System.err.println(description);
			
		}
		
	}
}
