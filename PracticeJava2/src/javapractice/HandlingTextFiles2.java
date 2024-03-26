package javapractice;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class HandlingTextFiles2 {
	public static void main(String[] args) throws IOException{
		File file = new File("./ TextFiles2");
		if(file.exists())
			file.delete();
			file.createNewFile();
			
//			String s="Hello Vara prasad";
//			
//			FileOutputStream fos = new FileOutputStream(file);
//			for(char ch:s.toCharArray()) {
//				fos.write((char)ch);
//			}
//			fos.flush();
//			fos.close();
			
//			String j ="jyothirmaye";
//			FileWriter fw = new FileWriter(file);
//			fw.write(j);
//			fw.flush();
//			fw.close();
			
			String prasad="Hello Jyothirmaye";
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			br.write(prasad);
			br.flush();
			br.close();
	}

}
