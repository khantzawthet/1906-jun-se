package io.file;

import java.io.File;
import java.io.IOException;

public class FileConstructor {

	public static void main(String[] args) throws IOException {
		
		// First Constructor
		File file = new File("/Users/khantzaw/tmp");
		
		// check folder
		if(file.exists()) {
			System.out.println("Directory is exists ...");
		}
		
		// Second Constructor
		File folder = new File(file, "Hello IO");
		
		if(!folder.exists()) {
			
			// create new folder
			folder.mkdir();
			
			// show logs
			System.out.println("Successfully created !!!");
		}else {
			System.out.printf("Directory: %s is already exists ...%n", folder.getName());
		}
		
		// Third Constructor
		File anotherFile = new File("/Users/khantzaw/tmp","Hello.txt");
		
		if(!anotherFile.exists()) {
			
			// create file 
			anotherFile.createNewFile();
			
			// show logs
			System.out.println(anotherFile.getName() + " is successfully created ...");
		}else {
			System.out.println(anotherFile.getName() + " is already exists ...");
		}
	}

}
