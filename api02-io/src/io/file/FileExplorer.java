package io.file;

import java.io.File;

public class FileExplorer {

	public static void main(String[] args) {
		showAll("/Users/khantzaw/iCloud Drive (Archive)/Documents/books");
	}

	private static void showAll(String location) {
		
		File file = new File(location);
		File[] files = file.listFiles();
		int fileCount = 0;
		int folderCount = 0;
		
		System.out.printf("%-15s %d%n","Total items:", files.length);
		
		for(int i=0; i<files.length; i++) {
			if(files[i].isFile())
				fileCount++;
			if(files[i].isDirectory())
				folderCount++;
		}
		
		System.out.printf("%-15s %d%n","Total files: ", fileCount);
		System.out.printf("%-15s %d%n","Total folders: ", folderCount); 
	}
}
