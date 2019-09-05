package io.stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) {
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("doutput.txt"))) {
			int i = 0;
			while (i >= 0) {
				System.out.printf("Name : %s Count : %.2f Price : %d%n",
						dis.readUTF(), 
						dis.readDouble(),
						dis.readInt());
				i++;
			}
		} catch (EOFException e) {
			System.out.println("End of file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
