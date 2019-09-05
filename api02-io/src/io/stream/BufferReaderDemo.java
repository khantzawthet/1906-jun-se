package io.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferReaderDemo {
	
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("input-data.txt"));
				PrintWriter writer = new PrintWriter(
						new FileWriter("output-data.txt"))){
			
			String line = null;
			int count = 0;
			
			while((line = reader.readLine()) != null) {
				writer.write(line);
				count ++;
			}
			
			System.out.println("Write Count : " + count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
