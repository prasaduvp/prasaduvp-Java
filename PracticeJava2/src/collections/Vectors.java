package collections;

import java.util.*;

public class Vectors {
	public static void main(String[] args) {
		Vector<String> v1= new Vector<>();
		v1.add("prasad");
		v1.add("sai");
		v1.add("malli");
		
		Vector<String> v2= new Vector<>();
		v2.add("jyo");
		v2.add("Anjali");
		v2.add("Akula");
		
		v1.addAll(v2);
		
		System.out.println(v1);
		
		v1.set(3,"Emo naku teliyatledamma");
		
		System.out.println(v1);
		
		
	}
	
	
}
