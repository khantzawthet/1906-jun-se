package io.file;

import java.io.File;

public class Storage {
	
	public static void main(String[] args) {
		info("/");
	}

	private static void info(String pathname) {
		
		File file = new File(pathname);
		
		long freeSpace = file.getFreeSpace();
		long totalSpace = file.getTotalSpace();
		long usableSpace = file.getUsableSpace();
		
		double free = ((freeSpace/1024)/1024)/1024;
		double total = ((totalSpace/1024)/1024)/1024;
		double usable = ((usableSpace/1024)/1024)/1024;
		
		System.out.printf("%-15s: %.2f GB%n", "Free Space", free);
		System.out.printf("%-15s: %.2f GB%n", "Total Space", total);
		System.out.printf("%-15s: %.2f GB%n", "Logical Usable", usable);
		
	}

}
