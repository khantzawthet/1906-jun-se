package io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo {
	
	public static void main(String[] args) {
		
		try (FileInputStream input = new FileInputStream("/Users/khantzaw/Downloads/laptop.png");
				FileOutputStream output = new FileOutputStream("/Users/khantzaw/tmp/copy-photo.png")){
			
			int data = 0;
			
			while((data = input.read()) != -1) {
				System.out.print((char)data);
				output.write(data);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
