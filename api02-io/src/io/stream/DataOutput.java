package io.stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

	public static void main(String[] args) {
		int counts[] = { 4, 2, 1 };
		double prices[] = { 700.00, 3100.00, 2000.00 };
		String names[] = { "beer", "kyayoo", "sartay" };
		
		try (DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("doutput.txt"))) {
			
			for (int i = 0; i < counts.length; i++) {
				dos.writeUTF(names[i]);
				dos.writeInt(counts[i]);
				dos.writeDouble(prices[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
