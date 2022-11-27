package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
		String filename = "C:\\Users\\caoth\\OneDrive\\Desktop\\JavaLab\\oolt.vn.721428.20221.20200569.caothanhtung\\Lab03\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test";
		byte[] inputBytes = {0};
		long startTime, endTime;
		System.out.println("start, Cao Thanh Tung 20200569");
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b: inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println("end, Cao Thanh Tung 20200569");
		System.out.println(endTime - startTime);
	}
}
