package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInAndOutChar {
	private static void readFile(StringBuilder strBuilder) {
		try {
			String filePath = "src/com/FileInAndOutChar.java";
			File file = new File(filePath);
			FileReader fReader = new FileReader(file);
			char[] data = new char[512];
			int rs = 0;
			while ((rs = fReader.read(data)) > 0) {
				strBuilder.append(data, 0, rs);
			}
			fReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void writeFile(StringBuilder strBuilder) {
		try {
			String filePath = "FileInAndOutChar.bak";
			File file = new File(filePath);
			FileWriter fWriter = new FileWriter(file);
			
			fWriter.write(strBuilder.toString());
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] agrs){
		StringBuilder strBuilder=new StringBuilder();
		readFile(strBuilder);
		System.out.println(strBuilder);
		writeFile(strBuilder);
	}
}
