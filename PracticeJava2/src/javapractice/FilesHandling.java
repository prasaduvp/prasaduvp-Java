package javapractice;

import java.io.File;

import java.io.IOException;
import java.util.Arrays;

public class FilesHandling {
	
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Test files");
//		System.out.println(Arrays.toString(f.list()));
//		System.out.println(Arrays.toString(f.listFiles()));
//		System.out.println(f.getName());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		File f2 =new File(f.getParent()+"resume2.docx");
//		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
//		System.out.println(f.mkdirs());
		
//		System.out.println(f.mkdir());
//		f.delete();
//		System.out.println(f.exists());
		
//		if(f.exists())
//			f.delete();
//		System.out.println(f.exists());
//		System.out.println(f.createNewFile());
		
//		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
//		System.out.println(f.exists());
		
//		if(f.exists())
//			f.delete();
//		System.out.println(f.createNewFile());
		
//		System.out.println(f.isHidden());
		
//		System.out.println(f.canWrite());
		
//		f.setWritable(true);
//		System.out.println(f.setWritable(false));
		
		
	}

}
