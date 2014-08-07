package 练习2;

import java.io.*;

public class Employ {
	public static void main(String[] agrs) {
		File file = new File("E:/eclipse4.4/控制台输入文件.txt");
		try {
			if (!file.exists())
				file.createNewFile();
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("请输入：");
			String str = br.readLine();
			System.out.println("输入的内容是：" + str);
			FileWriter fos = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fos);
			bw.write(str);
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader filereader = new FileReader("E:/eclipse4.4/控制台输入文件.txt");
			BufferedReader bufr = new BufferedReader(filereader);
			String str = null;
			while ((str = bufr.readLine()) != null) {
				System.out.println("文件中输出的信息：" + str);
			}
			bufr.close();
			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
