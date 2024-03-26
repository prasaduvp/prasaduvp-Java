package javapractice;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class HandlingTextFiles {
	
	public static void main(String[] args) throws IOException {
		File file = new File("./TestFiles");
		file.createNewFile();
		
//		FileInputStream fis= new FileInputStream(file);
//		int asciiCode;
//		while((asciiCode=fis.read())!=-1) {
//			System.out.print((char)asciiCode);
//		}
//		fis.close();
		
//		Scanner scanner= new Scanner(file);
//		while(scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
//		scanner.close();
		
//		FileReader fr = new FileReader(file);
//		int asciiCode;
//		while((asciiCode=fr.read())!=-1) {
//			System.out.print((char)asciiCode);
//		}
//		fr.close();
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int asciiCode;
		while((asciiCode=br.read())!=-1) {
			System.out.print((char)asciiCode);
		}
	}

}
