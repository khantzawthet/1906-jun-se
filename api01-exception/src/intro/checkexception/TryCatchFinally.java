package intro.checkexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Digit Value: ");
		try {
			int digit = Integer.parseInt(input.readLine());
			System.out.println("Square to digit: " + (digit * digit));
			
		} catch (NumberFormatException e) {
			System.err.println("Invalid Data. Please enter digit only.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
