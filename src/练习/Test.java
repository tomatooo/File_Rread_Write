package Á·Ï°;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	public static void main(String[] agrs) {
		File file = new File("E:/eclipse4.4", "we.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scanneer = new Scanner(System.in);
		String str = scanneer.nextLine();
		byte bt[] = new byte[1024];
		bt = str.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream(file);
			try {
				fout.write(bt);
				fout.flush();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream out = new FileInputStream(file);
			@SuppressWarnings("resource")
			InputStreamReader reader = new InputStreamReader(out);
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
